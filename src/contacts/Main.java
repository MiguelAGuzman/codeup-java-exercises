package contacts;

import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static contacts.ContactsGateway.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean confirm = true;
        List<Contact> contacts;
        contacts = readContacts();
        if (contacts == null) {
            contacts = new ArrayList<>();
        }

        System.out.println("\nContacts I/O - created by Bryce and Jeff.");
        do {
            int selection = menuSelection(); //line 65

            switch (selection) {
                case 1:
                    printContactList(contacts); break; //line 77
                case 2:
                    addNewContact(contacts); break; //line 93
                case 3:
                    searchContacts(contacts); break;
                case 4:
                    removeExistingContact(contacts); break;
                case 5:
                    confirm = false; break;
            }
        } while (confirm);
        System.out.println("\nGoodbye, and have a nice day!");
//        System.out.println("######################################################################################################################################################\n######################################################################################################################################################\n######################################################################################################################################################\n###################@###@@###@#@@@@@@####@@#######@###@@###@#@@@@@#####@####@@@####@@@@@@@@@###@@###@@@####@WW@###@WW@##@@@@@#@@@@@####################\n###################:x##;i##x;#,:::*,x#@i*;M#####z`n##:,M##iz.:::,+###W:z##*;#####@:*::.::*`n##:.x##i#*##@;:;;:;W::::,+n.:::,x#,::::@##################\n###################zi#W,,W#;z######x,xii@;M####@,#:##:z,W#iz:###@,@###W,z+:@#####@,@#M:#@,#,@#:z,W#i#*##x;###@*#*@##W,n*####*#+###:x##################\n###################@.W++*#W.@#.:::n#x.i@#;M####zi#;z#,Wz:@iz:####:W####M,:@######@,@#W:#zi#;z#:Wz:@i#*##n*###########,z.:::`+#,iii.W##################\n####################*+,MM:++##+@@@@##;x##;M###@.;i:,@,W#+;iz:####:x;;x##*z##z+###@,@#W:@,:i:,@:W#+;i#*##n*####x#+###@.z*@@@x:#ixxx@###################\n####################M`:@#:`W##izzzM##;x##;+zzz#iMMM;z,W##i`z,zzz+,@#####*z##x,#z#*;##W:#iMMM;#:W##i`#*##W.#zz#,n,#z#*;z*###@,#+#######################\n####################@zx##xz##M####x##nW##n####zW###Wnn@##@#M####zW######xM###M###z@##@nnW###Wnn@##@zMx###M####M#Mz##zWWx###@zMx#######################\n######################################################################################################################################################\n##################W################@#######M+++++++++++++++++########M##########W#######W+++++++++++++++++@#######M################@##################\n##################Miiiiiiiiiiiiiiii+W######n:,,,:,,:,,,,,,,::######@x*iiiiiiiiii*W######M,:,,,,,,,,,,,,,,:W#####@M*iiiiiiiiiiiiiii*@##################\n##################Miiiiiiiiiiiiiiiii+@#####n:,:,:,,,,::::::,:#####@x*iiiiiiiiiiii*W#####M,::,,::::,,:,,:::W#####M*iiiiiiiiiiiiiiiii@##################\n##################@ziiiiiiiiiiiiiiiii+W####@i:,,:,,,,,,,:,,:z#####xiiiiiiiiiiiiiii*M#####+:,,,,,,:,,,,,,,+#####M*iiiiiiiiiiiiiiiiix###################\n####################niiiiiiiiiiiiiiiii*W####@i:::,::,,,,:,:z#####xiiiiiiiiiiiiiiiii*W####@+,:,:,,:,::,,:+#####M*iiiiiiiiiiiiiiiiix####################\n####################@niiiiiiiiiiiiiiiii*W####@i::::,,:,:::z####@xiiiiiiiiiiiiiiiiiii*M####@+:::::::,:::######M*iiiiiiiiiiiiiiii*M@####################\n######################niiiiiiiiiiiiiiiii+W####@*,::,,,,::z####@xiiiiiiiiiiiiiiiiiiiii*M#@##@+::,,,,,:,####@#M*iiiiiiiiiiiiiiii*M######################\n#######################niiiiiiiiiiiiiiiii*W####@*:,,,:,:n####@niiiiiiiiiiiiiiiiiiiiiii*M#####+,:,:,::######M*iiiiiiiiiiiiiiiiiM#######################\n########################niiiiiiiiiiiiiiiii*W####@*:,,,:n#####niiiiiiiiiiiiiiiiiiiiiiiii*M#####+:,:::######x*iiiiiiiiiiiiiiii*M########################\n#########################niiiiiiiiiiiiiiiii*W####@*,,:n#@##@niiiiiiiiiiiiiiiiiiiiiiiiiii*M####@+,:,######xiiiiiiiiiiiiiiiii*M@########################\n##########################xiiiiiiiiiiiiiiiii*W####@*:n####@niiiiiiiiiiiiiiiiiiiiiiiiiiiii*M######:z####@x*iiiiiiiiiiiiiiii*M##########################\n##########################@xiiiiiiiiiiiiiiiii*W####@x####@niiiiiiiiiiiiiii+*iiiiiiiiiiiiiiiM#####x#####x*iiiiiiiiiiiiiiiiiM@##########################\n############################xiiiiiiiiiiiiiiiii*W@#######@niiiiiiiiiiiiiii#@W+iiiiiiiiiiiiiiiM#########xiiiiiiiiiiiiiiiii*M############################\n############################@xiiiiiiiiiiiiiiiii*W######@niiiiiiiiiiiiiii#@@#W+iiiiiiiiiiiiii*x#####@#xiiiiiiiiiiiiiiiii*W@############################\n##############################xiiiiiiiiiiiiiiiii*M@###@ziiiiiiiiiiiiiii#@####W+iiiiiiiiiiiiiiix@###@xiiiiiiiiiiiiiiiii*W##############################\n###############################xiiiiiiiiiiiiiiiii*M##@ziiiiiiiiiiiiiii#@@#@###W*iiiiiiiiiiiiiiix###xiiiiiiiiiiiiiiiii*W@#@############################\n################################xiiiiiiiiiiiiiiiii*M@ziiiiiiiiiiiiiii#@########W+iiiiiiiiiiiiiiix@niiiiiiiiiiiiiiiii*W################################\n#################################x*iiiiiiiiiiiiiiii*#iiiiiiiiiiiiiii#@@###W@####W+iiiiiiiiiiiiiii#iiiiiiiiiiiiiiiii*W@################################\n##################################xiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii#@@###W;*@####W+iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii*W##################################\n###################################xiiiiiiiiiiiiiiiiiiiiiiiiiiiiii#@@#@#W;,:*@####@+iiiiiiiiiiiiiiiiiiiiiiiiiiiii*W@#@################################\n####################################M*iiiiiiiiiiiiiiiiiiiiiiiiiiiz@####W;,,,:*@####@+iiiiiiiiiiiiiiiiiiiiiiiiiii*W####################################\n#####################################M*iiiiiiiiiiiiiiiiiiiiiiiiiz@@###W;,,:::,*@####@+iiiiiiiiiiiiiiiiiiiiiiiii*W@####################################\n######################################M*iiiiiiiiiiiiiiiiiiiiiiiz@####W;,,,,,,,:i@####@+iiiiiiiiiiiiiiiiiiiiiii*W######################################\n#######################################M*iiiiiiiiiiiiiiiiiiiiiz#####W;:,,::::,,:i@####@+iiiiiiiiiiiiiiiiiiiii*W@#@####################################\n########################################M*iiiiiiiiiiiiiiiiiiiz#####M;,,,,:,,:,,,:i@####@#iiiiiiiiiiiiiiiiiii+W########################################\n#########################################M*iiiiiiiiiiiiiiiiiz#####M;,,,,,,,,:,,::,i@####@#iiiiiiiiiiiiiiiii+@#########################################\n##########################################M*iiiiiiiiiiiiiiiz#####@;,,,,,,,,::,:::,:*#####@#iiiiiiiiiiiiiii+@##########################################\n###########################################M*iiiiiiiiiiiiiz######@:::::::::::::::::i######@#iiiiiiiiiiiii+@###########################################\n############################################W############n@######@+++++++++++++++++z#######@z###########z@############################################\n#########################################################@@###########################################@###############################################\n#################################**in+##Wi*x##;**iz*:W@+z***z##**ini**+*:***:*#;***i*ix#zx#ix@*#**iz;***zM#@;**ixi***@################################\n################################+#z++i##M:in#@i##niiz;@ii@@@M#+#z++;nnW#i###i#W;nn*#z++#WiW;*M*i##W;;zz:#M#@*###+*nnz#################################\n################################+nMxii@#M;in##i##niixxiii@z**#+nMxiixxW#i###i#W*MM*nMx*##i*Mi*Mi@#W;iMxi*M#@*###zxxx;@################################\n#################################*+*z#***z+i*+i**iz+M#niz***n##***zi*+x#+###+#W;**+W#@+##x;#xi#z**iz#####**#;***Mi***@################################\n######################################################################################################################################################\n######################################################################################################################################################\n######################################################################################################################################################\n######################################################################################################################################################\n");
        Files.write(filepath, ioOut(contacts).getBytes());
    }


}

