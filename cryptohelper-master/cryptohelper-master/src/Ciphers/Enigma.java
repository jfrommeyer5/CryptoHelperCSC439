package Ciphers;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
//import org.junit.jupiter.api.Test;

public class Enigma extends BaseCipher{

	public static void main(String[] args) throws IOException {
		Plugboard pbr = new Plugboard("ZYXWVUTSRQPONMLKJIHGFEDCBA");
		Plugboard pbn = new Plugboard();
		//Plugboard pbe = new Plugboard("AABCDEFGHIJKLMNOPQRSTUVWXVZ");
		Reflector rf = new ReflectorB();
		Rotor[] rotorArr = new Rotor[3];
		Rotor[] temp = new Rotor[3];
		temp[0] = new Rotor1(1);
		temp[1] = new Rotor2(2);
		temp[2] = new Rotor3(3);

		//		try {
		//			PrintStream fileOut = new PrintStream("./out.txt");
		//			System.setOut(fileOut);
		//		} catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//		}

		for(int i = 0; i < 3; i++) {
			rotorArr[temp[i].getPos()-1] = temp[i];
		}

		String a = "AAAAAAAAAAAAAAAAAAAAAAAAA";
		String msg = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String out = "FTZMGTSXIPJWGDDJQYUWTNXYZDMXFIERRWZGTOIUFEJCHJKTYBCOEPVXNPVRWWESFRIXKKPTVSMWXIZWNCZEUCOBLTUYYDDGBCDKDFGUBOOJESLCPXKUBLPFZVANCWOTJIKORPJFCHOLLNQLJGCIMVADEGDTZHDKSSUETAGQUQPLAZANCWOTJKOZBPITDUPPAFYZDGQZUWTNXYZWHNKKEUPJLQKRCXVLNEEYQVLPRBUDIGFWFGAWLMEETTKDQABCJCEWVNCDSMIHZSUHXXHIUEKLUZCDFFJIVOUPEWKGSSWVIKJWPTVSMWXUBULYQXLHMPHDBWXYQVZRWMQSPSKTFNLYCMNYFOQDCPHNVPZABIBVBSGNNTLAYGDJBODPJLUWTNXYZMSFUOMLBFHLUIJKRKCNWBEFHELRHLVHEOPQWQSSCHKNNYRSYLAUMRNHRSMATGEFKNOQNUVBODXPUKOWXEXZAJORIXRYZFSHZLYOSURLVQENOVWJVCDJWUFXSSWYYOSURLVUVWDWWZIYQETQXYERMASXNRTQKIMOYFPQRPRTUZILMOLHTZMBVNSBDAHIOKQKTHXBDAQEFGIKHOPVIPUXYAXEFLYNHZEUYAXRBCDKDFGTGVPHMCGIFZJKLSLNOXCFGIFMNVYZBYFGMZOIAFVZBYSCDELEGHQQBPBHDQLOSRZFBRMNGQTZMBVNSMYPSNRFMHYRGLVRJPGQMVADEGDMQHBECZNJXVZFSQEZTFSXNRTQKPLIPRQHKPMUMKHVOBBUGHJGNOUYVGMVCMIBGZYVXBHSOEKLUZCDFEJIBOWHEEMTZFWVOKLGGHJGNOUZVIFDIOICQROOXVKIGDRSYLAUMJXHRFHVOFDZKNZQWOOMXUOYZAHUEZUVWHVXMJXIFZOSWVGHJGNOUSMYTKJMRXGXOPITHLZPKLUZCDFTXXWTNFOBEKCGZUJQYUMVADEGDWWFMHLMJQSWCVTKHNKTKLUZCDFXKMDZXSCSUVJQQNPHTZANCWOTJVYKBUFCMZOKRFVGLWYYCFGIFMNDOXOIUCDUQCIUYULERVCFGIFMNEBIJPTRLDIJSEBVFGWOHJKTYBCLQGXUJDNONWPYSBGWKGJQRXKZTKISTUGUWUYLOPROVWCPEYQVLPRBDAHIOBQKKNXBDAUEXSNGIJSXAUOTXXZTDEKXMYYDDXZWUWTNXYZYFYABOPSCVZZAGTICOZPTVSMWXNPMXQRSZHUVEYMNPMTEANCWOTJTGVPHMOGIRZJKLSKNOXRSYLAUMVYZBYFGMZOIAFVZBYSCDELEGHQGZBCLQTUWTABHUJDVAQUWTNXYZACDMRUVXUBCIVKEWBRVXUOYZAHXUSCGPWFSWSFHEOTTUXQABCJCEJIKOKFVWOKSRURGWLUJXUOYZAHSMWWCRERVPJOGIYYDWGBCDKDFGEFPZENDSRHTIWGRGZLIJQRXKZTQFKZKJGSYQEQWGGBLMDDELEGHQZHCVMGPPJGJCSCCIJWXPTVSMWXCLOUEYRKGEGJIHLFZJTHJKTYBCRGJOMFSGEWENULPPJMYANCWOTJDJSGDSGEQNDQJWOBIPXDELEGHQDWJYQLUJLYDHZTPVMPREYQVLPRLNPNQRSTDUTOTORPMLXANCWOTJLCVRZXGXJPYQNKSBHHMDELEGHQHMEQVBJRRSUTCIFSSBCYOSURLVRHNNXEAPQXTETCXNXLEODXPUKOWEYHJHAVPOBGBFTNFDEODXPUKOQNHRSSATVWZENOQNUOBODXPUKOSKPBPLICMEOVFQRAGINLIPQWJYJCDMRCVXONCIVKEWBRVXUOYZAHUVWDWYZINNYTQXYERHNSXNRTQKRUXLAXKFLYNHDEUQAXRIKHOPVITGVPHDCGMFCJKLSLNRXCFGIFMNRHLEKEOPTXQSXCHKLNTRSYLAUMFOTWXZHDEMXMGYDOXZWGHJGNOUYFYABKPSTVSZAGTICUZPTVSMWXOISTUBUWXGLOPROVWCPEYQVLPRSKPFJLICMNOVOQRAFIJLIPQWJYHJETHOSEFGFOPWFPNVHANCWOTJJBZEORVLTRZXXBZWKOBXUOYZAHEGHUCLEGWHGNILQYDJMBCDKDFGWRBBTUUHLNEZFNJVQMIEYQVLPRCQYHWTQNBFRBBSTMRGRTZMBVNSZHCYBDLPESOTZCCRCICWBEFHELQLBOJPOKGEGCUHJKFJNRSYLAUMCNJOLDGTNUNNUOPBVXLDELEGHQYJWMDSJEUWDJVWYSIPGYOSURLVHTVYQJYYLYFHZPSCMVRVPZABIBTBFFQRSLWUGQOBKPMJRANCWOTJLEYHTRQVLPRCBFTMQGMTZMBVNSRDEFMBJQRSUYODFSJBFYOSURLVRHRNUEGPQXVQTCIBWTWDELEGHQREGOTHHVPMBGUFBOQDEGHJGNOUQNHRSPATVWEWNOQNUMBODXPUKOSKPKELICMGOVRQRAZIULIPQWJYJCDMRFVXTDCIVKEWBRVXUOYZAHUVWDWYZINXDTQXYERPNSXNRTQKUUXPAXOFLYNHKEUKAXRRSYLAUMTGVPHBCGEFVJKLSLNTXCFGIFMNRHLUKEOPHXQSICHKLNWRSYLAUMFOTWXZODEPXMGYDKXZWRSYLAUMYFYABKPSTVSZAGTICUZPTVSMWXOISTUBUWXGLOPROVWCPEYQVLPRSKPFJLICMNOVOQRAFIJLIPQWJYMKVITSACLVLNMQSNQCMODXPUKOXQLYIOLNRTKKZSHREYXWBEFHELGBONWUULMTKPTBLVRYREYQVLPRYEFMZBFVHTKVVFKJHYWMVADEGDXTCLLGYYHENFDPCCVXKVPZABIBCNKSUQKTGEUJLOGQWBJIKHOPVIYEEMPOGVODJEVFFBGWFDELEGHQUMSTORHRCMIOPIOOKSVGHJGNOUNQIEMJINTHWTXSVAJKDLIPQWJYJEQNBCVVQXOSTFMWCIKXUOYZAHFWUSWYZJUQNMLTWERXHSXNRTQKGOUPDFBDXTOUKYWUIIQNGIJSXAJLXWUIEKLYNBGHUYWXNBCDKDFGEBYJWCLLDIZHEBTRRODWBEFHELYVOKZZGIEEXMRXLBHZWDELEGHQWXEXZHJORSGQYZFSHJTYOSURLVHWQTFDHJGBKLPTMOOYIGHJGNOUGLRETYFKHXGDXHIJQJLMVADEGDIMOLFPQRYJSUDILMOUPTZMBVNSJSFHOGABFHEYBJKNKMNODXPUKOGZBCLYTUBTWBHUJDVKQUWTNXYZXRJHEIKHFLMNBNPQZEXIKHOPVICJKQDSDEJDDFCWGGIPIJQRXKZTOISTUBUWXGLOPROVWCPEYQVLPRRHLNKEOPQXQSTCHKLNKRSYLAUMWXEXZAJORSURYZFSHBTYOSURLVTXQVGQPONCUFSZMITBLPTVSMWXXFUZBSBSCFRMWGWUCGQNGIJSXAZCWOLCUXYPNFUKYVVXCEYQVLPRPTOXRKNYBIYYYPLZBHWFMFHIRWINGQZXUTZTKDCOBVHYXEYQVLPRDNNTOVJTJLXPPOXSKZUYOSURLVXYFFUGCMOOILOVKLWSWCFGIFMNLTKQVTNYFJVFCPGZSTWFMFHIRWOWZWNDCJCTKXGTZLPYOCFGIFMNIINJBYQWDIECERXMCMOTZMBVNSDSZTXZWBGKFXPJZTXVQQABCJCEILHMQBLKPRVNVHQRMTSWBEFHELVOPHPIIDMNOIBYRAGIOLIPQWJYUVKDGYQINQWJQXGMTKTTZMBVNSEVHCKJLIONWPHXQRLKMWBEFHELVYZBYZGMZOXGFVZBYZCDELEGHQNPMHXRSZSVVEBMNPXTOANCWOTJGRJOEGKHPKMNUNPQZEHIKHOPVIGZBCLQTUWPEBHUJDVMPUWTNXYZXTUQCVRYHMPQCPWFDQFHJKTYBCFOTWXGWDHKIMGYDTXSWQABCJCEMSFCOGLBXHEYHJKRKMBWBEFHELLQGKMJPNOGWPRSBIJKMPTVSMWXDENSVWYVCDJWLFXCSWYVPZABIBWXEXZAJORSURYZFSHBTYOSURLVQNHRSTATVWFKNOQNUVBODXPUKOYNSMEIGTSKWQVOOBZKHDELEGHQXNXHIMZTOKJXBOUEEWFSXNRTQKQMBJZXURWFWBEIJVHKWEYQVLPRBFDZDJUSXETKWGEVILWEYQVLPRQLSVYWSKPQWHSHOPYKDANCWOTJMNFWJJYTCGRCGOKCFGQVPZABIBCKXWYYKCONOGGQUQYITIKHOPVICJREMGZEKWODXWIEJIISXNRTQKDYRFYFUMKLIBOVIVYSSEYQVLPRGRZRBSUHVWYKNNZVCHBEYQVLPRVEPCKEOVDXXIHFRKLZIRSYLAUMYHOFZXQPBVXJOCLMHZZTZMBVNSTBOFCIQLYRTDOBLMDLWTZMBVNSBDEHBOZQKCBEBDFECDNSXNRTQKWVGUFBAIXULOIXBNOCPODXPUKOLQGKMGDNOPRURSBGJGMJQRXKZTDENGPWYVCXJWJFXCGWUVPZABIBGXEXZVJOVCURYZFSHBTYOSURLVVYZBYFGMZNXAFVZBYZPDELEGHQCWQLNDJJGAKLDTMSPYDYOSURLVIMOLFSQRERRUDILMOGSTZMBVNSPUXUAXEFZYNHIEUYAXPBCDKDFGGZBCLQLUWPABHUJRVAQWBEFHELJTUVCVXYHMPQSPWXDQFZRWMQSPLQGKMJDNOPWPRSBGJKMJQRXKZTCJKQDSMEJZDFCWGHIPIKLUZCDFLHFLOCCPFLRDDCKLKGQCFGIFMNYYNMPPIMMPRGVVXAGGJLIPQWJYUSMCQRGBJRSQHJNBMUVDELEGHQPRSCERHHQMSPHNOOZUOGHJGNOUCKKBPNTCRZPZFQGDGQBUWTNXYZWQEQOATNRSPOCSFDKQBUWTNXYZWIIFHUAWFGLMORVNNCPODXPUKOJRTWNSVHEYQMGNDWPNOXUOYZAHETZZCVXYGEPQWPZXDQMZRWMQSPSBEUFOCLFHRYIBFLOGNCFGIFMNMMIABKPRTVVTAIVICTCPTVSMWXQYJRVTMMGWZGNVPHSOBKLUZCDFCACDSCNAPJBNQACZUDZFMFHIRWDENSMWOVCDFWLFXKJVXRSYLAUMCHXIISJPJVDFMCUSEPIYOSURLVRHLNKOOPQXJHTCHKLWKRSYLAUMJTUFGVXYHKPQOPWXTQGZRWMQSPZBIJPCRLNTYCEBVFGHOHJKTYBCPUXYAXEFLMGHZEUYAJHBCDKDFGTZBFLQGUWTABOUJBVAQDELEGHQQNHRSLATCWNKNOQNUXBODXPUKOHWQXNDHJVAKLYTMOPYJGHJGNOUZACZGHVAPRBGWACWTDEXUOYZAHACDMRUVXUBCIVKEWBRVXUOYZAHDENSVWYVCDJWLFXCSWYVPZABIBEBIJPCRLDIYCEBVFGHOHJKTYBCAODNRBMDUFCVTYEHBRRKLUZCDFCJHKFWOEJEEERWQKOMERSYLAUMRRNRNSYHKYOYNNXCPIOVPZABIBNHGLNGYPXXYJDCBCPHKVPZABIBVULVGRPFWOGASEHITJXPTVSMWXBZADDTYUWTAPQUACIAZVPZABIBUPVSYGWZIUVHLMSTYTXQABCJCEYWPFSERJHJTVOTRFULIHJKTYBCOSGDOGNBYFEEQJBZKMZFMFHIRWUXRBWHQOZOYAFZIMRHCTZMBVNSHYRLZAJMCSYGDVISHHFYOSURLVRVOQQIRIIXCOCXLFMRKHJKTYBCLRVSNNCHIFZKLNSLPOLCFGIFMNHWOIHDSJGASGMTLPNULANCWOTJGZJJLRVUSFVEEUPWVTUXUOYZAHJTUVCKXYHMVTSPWXDTFZRWMQSPGZBZMQTUWRABWUJDJALUWTNXYZBUXYALEFFQNHZEUYAXRBCDKDFGYFYABKPSTCCZAGTICROPTVSMWXVNHWSTUTVWFKGOQVUVBEYQVLPRCJKQDRMEUZKFCWGHIYIKLUZCDFZACVGHNAIJBGSACZTDCFMFHIRWXRJOEIIHBXMNUNPAZEHLIPQWJYBDAHIOBQKCHXBDAUEFGNGIJSXAJTUVCVXYHMPQSPWXDQFZRWMQSPKLRETNFKAEGDXHIJQJLMVADEGDVGBVYFPGZKIASLJIYSYPTVSMWXRHLNDGHPPMQTTCHOINCGHJGNOUNUQJGNHFRAKLEEMOTYBGHJGNOUQNDQCIETEWYYCOEYDHBBCDKDFGDJOJZXYEMXWWEWLCHKXVPZABIBODSXIKAQKCHPYDONEFUODXPUKOHCMGMGYXSBCEJKNCJRGVPZABIBKKXYIGICUJVHZQUAETXLIPQWJYOBFWPCZLKHYKGBKEGHFSXNRTQKVRNPYEQHIFSJKNXMYUXTZMBVNSUSJBIOBBVCUZFJPUEBVNGIJSXADLQVQSPKPDIBSHMIMSYPTVSMWXVNLLDMOTQXQIDOHKINXRSYLAUMXRTOPIHHBLWUUNDOGKDGHJGNOUPPSWQVYZHNPQGMOCMQFVPZABIBSKPFJIICMNPQOQRAFQJLIPQWJYPUXCRXEFLHNHHEUYBXYBCDKDFGPMOLFMQRSKTUDILMOLSTZMBVNSHWQINDHJGHSLMTMOPUZGHJGNOUMFYJBKASTVSZEGTNCUZODXPUKOOISTUGUWYGOOPROVWIPEYQVLPRDENYVWYVBDJWZFXCSWBVPZABIBKLRETNMKATGDXHIHQJLKLUZCDFSKPFJLICMNOVOQRAFIJLIPQWJYACDMRUVXUBCIVKEWBRVXUOYZAHUVWDWYZINQRTQXYERGASXNRTQKFIMLXZRWEKMFDRNFXENHJKTYBCIDBCLTWQGTAVHDJTVAQQABCJCEVBIJFCCLSPYCEBVLOHNCFGIFMNACDMRCKXOGVTVKEQBTCIKHOPVILGGEPZDGTWWPXLBGGKJJQRXKZTHPQKAIWZLYNFRMMTAXBQABCJCEYJZACWEEVZDZAWZYDPVBCDKDFGFSGKOGMBFGMPRJBHKEKKLUZCDFLXAZZAAOKCUXWZANHBPODXPUKOERXWIQOHEKUMGNUKEBWRSYLAUMOMUKJLIRKNPBRIWAFQOLIPQWJYMQZMLWANGHNXVSZNVXNODXPUKOWFAZOUBSKCHNWGAUKFJNGIJSXAACKMTUMXUBFNVKGHQVIKLUZCDFJWKLMTGJVJFKDTGBJVBDELEGHQHWQINNHJGAIZMTMOPSDGHJGNOUEBILFCRLDJYCDBVFOHFHJKTYBCFJKQDGMECTDFCWGHIPIKLUZCDFSKPFJLICMJBVOQRAFDKLIPQWJYOMOHFPBRYRTUBILUOLSNGIJSXAJTUVCMXYVMYQSPWXDHFZRWMQSPGZBILQTUKTABMUJDVAJUWTNXYZOISTUBYWXJLOPROCWCPVPZABIBLQGKMJDNOPWPRSBGJKMJQRXKZTVYZBYFGMZOIAFVZBYSCDELEGHQDENSVWYVCDJWLFXCSWYVPZABIBJKMDTVXCHMFNQQNXQVZZRWMQSPIBLLHQLLGRTODBHRNLSWBEFHELTGOPWMCGQTKJKLLLRYRCFGIFMNVYZBYFLMKNMAFVZRYECWBEFHELWXECFAYOOWURHZFCOBIVPZABIBCPKGQFIZGUVRJMGAMTHLIPQWJYQEBRXBPVVDJENFJIXWVPTVSMWXNZSTLQGUWKAOPUOBVATDELEGHQJQTRMJVNEHWMNSDWJKWXUOYZAHHDANIILQQXBSTDAREDKWBEFHELJQFJWYZNKQEYESKERMHSXNRTQKGASZSWFAHTOIWAOJUIQMVADEGDASXBUUEBLYNZFJUYWXFBCDKDFGEBGJDCDLDIXNEBBGIZDJQRXKZTJWPBTZHJEAXMFTROQZWGHJGNOUWXEXZHJORSEQYZFSHMTYOSURLVHWQOEDHJGBKLUTMOZYBGHJGNOUFLRETZFKHFGDXHIJQJLMVADEGDIMOLFPQRYXSUDILMOUKTZMBVNSBSFPOGABFHEYKJKNKMNODXPUKOGZBCLATUFTWBHUJDVKQUWTNXYZXRJDEIKHOLMNQNPQZEZIKHOPVICJKQDSAEJUDFCWGNIPIODXPUKOOISTUBUWXGLOPROVWCPEYQVLPRRHLNKEOPQXQSTCHKLNKRSYLAUMWXEXZAJORSURYZFSHBTYOSURLVHHOINWHPGALKMCLOPCUGHJGNOUDQNDUUMNBOJLQSXHWWYKLUZCDFYLYAVKPKPKSRAHTISUVPTVSMWXBDAVIOPQXTHXSDAIEFGPTVSMWXGZBVLQTUEIABSUJDVAQUWTNXYZGKBFJNYCMNOVOQJCFIJVPZABIBEGEWYZFGEFZMGLFJYOMMVADEGDPLIJRAHKRSUCEHVOBBIGHJGNOUKKREJLECAEODXQIYFILBCDKDFGJACDGXNANQYTQACZTHAFMFHIRWNWGPVWYJYDQLKTBCSNCVPZABIBXIOTUDYWXLZPPRLCWOHVPZABIBGERNSQFVAEGBTFIJUJNMVADEGDZAVZKHBAPJZKWASULOXNGIJSXAUBUZZQBLWIABWBWUHAQNGIJSXANPMGQOSZSUGHJMNPMJUANCWOTJTGVSWMCGIKZJLLSLRORCFGIFMNRDAHIEBQNXHXBDAUEFGNGIJSXAEBIJPCRLDZGCEBVFGJLHJKTYBCPRJNEIGHBLMNTNPBZEHDELEGHQRHLNKHOPXXNSTCHKLXKRSYLAUMOISSUBUWQGLOLROVWCXEYQVLPRYFYABKWSTESZAGTTCUZQABCJCEQNHRSTATVWFKNOQNUVBODXPUKOSKPFJLICMNOVOQRAFIJLIPQWJYPUXYAXEFLYNHZEUYAXRBCDKDFGNJEGNORESUQNJWFFPNVHJKTYBCHGQEODAGTAKFXLMNKYDODXPUKOZAYZJHNACTBNWATZFDMFMFHIRWYFYABKOSTSSTAGTKCUZRSYLAUMQNHRSZATVFFKNOQNUVBODXPUKOJIUTUZUWMGLOPRWVWCPEYQVLPRAUJMRUVFUYNIVEPWBXNXUOYZAHENWDAXYTLYMTQOYCAERVPZABIBEGIJHMQGDIZCELVMNOOTZMBVNSCGXCHMCGWTZBHLULNOQCFGIFMNBDAMUBUQWGGXVDAVWJREYQVLPRBQNSVRKNCCRWLSXQSGGIKHOPVIWJTEMEWEEKXSXWDTJZBQABCJCEKLJEENGKAEMQXHPBZEHDELEGHQRTBVOPXYYJTUSPJXKLSZRWMQSPUVWDWPZINQHVQXYERFASXNRTQKCJKKASMEJGDFRWGHAPXKLUZCDFIYZBYPGMTRIAFVZBYSCDELEGHQACDMRUVXUAKIVKEWBYDXUOYZAHYISAUBPWXGLOAROIWCPPTVSMWXXRJOEMKHQLVNUNPQZTHIKHOPVIBDATIOBQCCHXPDAUEFYNGIJSXADENSVWFVCVJWLFXJSWYMVADEGDFOTWXZWDEKXMGYDTXZWQABCJCECJKQDSMEJZDFCWGHIPIKLUZCDFTGVPHMCGIFZJKLSLNOXCFGIFMNRHIKYHOPXXZHRCVKYONRSYLAUMTXVULMCOUFZVIZSLVOHCFGIFMNACQMRBVXSCCTVKMWBRVXUOYZAHWZEXXAKURPURYUFQXBTIKHOPVIUAIZBHNAPKBGWAVZCDEFMFHIRWYFYABKPSKOSZAGTICUFPTVSMWXXRUOEIKHBLMNUNWQZELIKHOPVIFINSVWOWIDJWLRXKSWYRSYLAUMUVWPWYZINQRGKXYERGASXNRTQKWJKQDSMEJZDFCWGHIPIKLUZCDFVIZBYFGWSORAFRZBYGCDELEGHQTGVIHJAGKFZJMLSNNOXODXPUKOQNHZSTATVWFMWOQNUVIODXPUKOYFHABKRSTVGSAGQFCJZHJKTYBCZSKUBGLBFHEYIJGRCMNWBEFHELBDAHIOBQKCMXBDAUEEGNGIJSXAFOTIXZWDEKXMMYDTXZFQABCJCEUVWDWQZINORTQXYERGASXNRTQKLQGKMJDNOPWPRSBGJKMJQRXKZTCJKQDSMEJZDFCWGHIPIKLUZCDFPUXYAXEFVYNHZEUYAXRBCDKDFGVYZIYFGMZOIAMVZBYSGDELEGHQMSFUOGLBFJEYIJKRKMNWBEFHELXRJOEIKHBLMNUNPQZEHIKHOPVIIMOLFPQRYRTUDILMOLSTZMBVNSJTUVCVXYHMPQSPWXDQFZRWMQSPIACZMKNAQJBMWACZJDEFMFHIRWLSFTFYBBFHEYPJKUOMTNGIJSXAUVPDLTLINIRSQXRRVGAWBEFHELNXMGMRSOSUVEJZNPJTQANCWOTJZKRFJLICKNOCOQIAFIJLIPQWJYDYNQDSMMHVFFCVXHIVIKLUZCDFDYNSVWIMROIWLVXASSYLIPQWJYOPKQUBUZQGLFCMGVWCPEYQVLPRLWGKNDDJOPKURTBGPYMJQRXKZTRHLJCTOPDIQCECHKDNORSYLAUMRVWDXZWINKBTQXYTXDAQABCJCEIZBBLQTUWRAZFUJDVASUWTNXYZPUPYAGIFMNOHZERAAIRLIPQWJYUVXDIYTINQYCQXUDEHOUWTNXYZFXTTXJWOOKWPPZDTXKMQABCJCEVYZBYAGMZOURFVZBYBCDELEGHQNPMRNRSZSAVENMNPPTDANCWOTJDRJOERKHAEMNUNPQZEHIKHOPVIGZBCLQTUWRTBHUJDVLFUWTNXYZHTUUCVLYHMPQIPWRDQFWBEFHELFOTWXQWDWKAMGYDTXAWQABCJCEMSFOOGLBLHEYUJKRKMHWBEFHELLQGKMJTNOZWPRSBDJKMUWTNXYZDENSVWYVCDJWLFXCSWYVPZABIBWXEXZAJORSURYZFSHBTYOSURLVQNHRSTATVWFKNOQNUVBODXPUKOLZSTTBUULGLOPUOVQCPEYQVLPRIQEKKJDNOPWPRSFGLKZJQRXKZTMSOUOFCBFHFYIJLLKVICFGIFMNGEBCPQTVWTABHFJDGACUWTNXYZXVVDWYFINQRZQXSJRGAMVADEGDVPZBYFGZGEPAFMZBYQCDELEGHQWXEXZAJOVSUQYZFSHBTYOSURLVHWQINDHJPAKLMTMOPYDGHJGNOUACDMRUVXURCOVKEWBRVXUOYZAHJTUVIVXYHMPQSPWXEQFZRWMQSPEBIJPCRLDIYCEBVFGHBHJKTYBCPUXGAXEFLYDHJEUYAPRBCDKDFGMSFUWULBFHEYIJKRRMNWBEFHELNPUGQRSZSUVEJMWPMTRANCWOTJWWEXZAJJRSURYTFSHBTYOSURLVKLRETQFKAEGNXHIJQJLMVADEGDZACZGHNAPCBGWACZTDEFMFHIRWFENSVHYVMDJWLFXCSWYVPZABIBJTUVCVXYHMZQSPWXDOKZRWMQSPSKPFJLVCMNOVOQRWFIJXUOYZAHEBIJPCRLDIJCEBVFGWOHJKTYBCFOTWXZWDEKXMGYDTXZWQABCJCEPUXYAXEFLYNHZEUYAXRBCDKDFGKLRETNFKAEGDXHIJQJLMVADEGDHWQINDHJGAKLMTMOPYDGHJGNOURHLNKEOPQXQSTCHKLNKRSYLAUMOFYAOKPSQVSEAGTIKUMPTVSMWXOIUTUBUWXXJKPRWVWWPEYQVLPRRWMNKEOJMJNSTTNKLXKRSYLAUMBXFROGFOFHEYNZKJKMNMVADEGDZUXYAXUFLYNTZEUVAXREYQVLPRUVWDJYZIRVITQXYEFSASXNRTQKNMOWFPQRYRTLGILMOLSTZMBVNSUPMGJRSZSUVEJMNPFTUANCWOTJYFRABKPSTTSZAGIICUZPTVSMWXDENSVWYVCDJWLFXCSWYVPZABIBZAEZGHNAPJBGWAFZTDEFMFHIRWKLRETNBKAEGDXHIUQJLNGIJSXAVYZWYFGMZOIAGVZBYSCDELEGHQGZBCLQTUWTABHUJDVATUWTNXYZSKOFJLSCMNOVOQLPFIJANCWOTJTGVPHMCGIFZGKLSLNOXCFGIFMNQNHRLTATVWFKNOQNVVIODXPUKOHWQINDHJGAKLMTMOPYDGHJGNOUDENSVWYVCVEWLFXCSMYVPZABIBLQGRMJRNOPWPNSBFJKMHJKTYBCMSFUOGLBBHEYIJKRKMNWBEFHELUVWHWYZINQRTBXYERGASXNRTQKNPMGQRSZSDVEJMNPMTUANCWOTJGZBCLQTUWTABHUJDVAQUWTNXYZEBIJPCRLDIYCEBVFGHOHJKTYBCHWQINDHJGAKLMTMOPYDGHJGNOUTQGKTJPNLPWPRSBIQKMPTVSMWXQNHRBTKTVCOKNOQQCIBIKHOPVISZOFULIUMNOVOULAWIJLIPQWJYXERTTNFVAEGYPFIJQJLMVADEGDXFYABXPSTVSDAGTICUZPTVSMWXQTHVZVXYGEXQSPQXHZFZRWMQSPVQXTAXENLPWHPSUYAKRBCDKDFGUVVPDYZINQVJKXSEITASXNRTQKTAUPGHCAIFBJKAWLTDXCFGIFMNGZNALQTUTVAZAUXDVAZUWTNXYZOITTFPQWXRLOPRDMOCPTZMBVNSHLAHIOBKKAHXBHAUEFDNGIJSXAVOJWXZKDBLMMGYPQXEWIKHOPVIQNRRTTFTVWGDNOIJQJLMVADEGDIMOLFYDRNNRTDILGOGAJQRXKZTACDMRYVXUBRTVKEWBGVXUOYZAHVYZQQFGMZZIACVZBMSIDELEGHQVZBCLFTUZOABHUJDVAQUWTNXYZOISTUBUWXTCOPROVWRVEYQVLPROLRVTNUKAEGDSHIVQJLEYQVLPRBDAHIGBQBCMXBDAUEEGNGIJSXASKPHJLICKNOVBQRAFIGLIPQWJYEBIJPCYLDDYCEBVCGHOVPZABIBUVWDWYZINQRTQXYERGASXNRTQKMSFUOGLBFHEYIJKRKMNWBEFHELZACZGHNAPJBGWACZTDEFMFHIRWPGVZHMCGJXZJWLSLNOXCFGIFMNWXEXZAJORSGRYZFSHJTYOSURLVQNHMSTATVWFKVOQNUVBODXPUKOIGEKMJDGOPWPRLFGJKMJQRXKZTNLREJNFKAEBNXHIJFDLMVADEGDFOTWPZWDEBGMGYDTGJIQABCJCEJTUDCVXYHMPQQPWXDQFZRWMQSPRHLNKWOPQXQSTCHKLNKRSYLAUMIMNKFPQRNRTURIXMOLSTZMBVNSWJEXZAJERSURYWFSHBTYOSURLVAVDMRUVIUBCIVXEWBRVXUOYZAHVYZBYFGMWOIAFVZBYSCDELEGHQCJKQDSMEJZDHCWGHIPIKLUZCDFPUXYAXEFLYYHZEUYAHRBCDKDFGYFYABKPSTVSZAGTICUZPTVSMWXXRJOEIKHBLMNUNPQZEHIKHOPVIMSFUOGLBFHEYIJKRKMNWBEFHELNPMGQRSZSEVEJMNPMTUANCWOTJTGVPHMCGIFZJKLSLNOXCFGIFMNACDMRUVXUBCIVKEWBRVXUOYZAHSKPFJLICMNOVOQRAFIJLIPQWJYKLRETNFKAEGDXHIJQJHMVADEGDJTUVCVXYHMPQSPWXDQFZRWMQSPIMOLFPQRYRTUDILMOLSTZMBVNSYFYABKPSTVSZAGTICUZPTVSMWXBDAHIOBQKCHXBDAUEFGNGIJSXAZLREWNFKALGEXHIJRJLMVADEGDFOTWXBWDEKGMGYDTXJWQABCJCEIMRCFPQRYJTUHIIMOLSTZMBVNSIASZGHNAPJBGWAOZTDEFMFHIRWACDMRUVXLBPVVKEWBQVXUOYZAHHWQIPDHJBADLMTMOGPDGHJGNOUCJKDDSQEJZDFQWGMIPITZMBVNSLQGKMSDNOPWPRSBGJKMJQRXKZTWXNXZAJOGSURYZXSHBTYOSURLVFBTWXWWLEKXMGBDTXZWQABCJCEZKPFJLICMNOVOQRAFIJLIPQWJYMSFUOGLBFHEDIJKRKMNWBEFHELBDAHIOBQKCHXBDAUEFGNGIJSXAACDMLUVXUBCIVKEWVRVXUOYZAHQNHFSTATVWFKOOQNUVBODXPUKOHWQINDHJGAKLMTMOPYDGHJGNOUEBIJPCRLDIYCEBVFGHOHJKTYBCCJKQDSMEJZDFCWGHIPIKLUZCDFSKPFJLICMNOVOQRAFIJLIPQWJYLMOLFPQRYRTUDILMOLSTZMBVNSJTUVCVXYHMPQSPWXDQFZRWMQSPGZBCLQTUNTABHUJDVAQUWTNXYZOISTUBSWXGLOPROPWCPANCWOTJLQGKMJDNOPWPRSBGJKMJQRXKZTVYZBYFGMZOIAFVZBYSCDELEGHQDENSVWYVCDJWLFXCSWYVPZABIBJTUVCVXYKGPQSPWXDQFZRWMQSPIMOLYPQRYRBUDILMYDSTZMBVNSNGVUHMCGIFZJILSLNOXCFGIFMNHMBBYIGRZOIAFIJBYSCDELEGHQHJEXZAJERSRRYWFSHGTYOSURLVNPMXHRSZSIVEYMNPNTUANCWOTJQNHHSTATVWFKBOQNUVBODXPUKOGZBCLDTUWTABHUJDVAQUWTNXYZFOMWXZWDUKXMGYNTXZFQABCJCEBTAHIOBYKCHXBPAUEFGNGIJSXAMSFUOGLBFHEZIJKRKMNWBEFHELZACZGHNAPJBGWACZTDEFMFHIRWACDMRUVXUBCIVKEWBRVXUOYZAHLQGKMJDNOPWPRSBGJKMJQRXKZTHWQINDHJGAKLMTMOPYDGHJGNOUOISTUBUWXGLOPROVWCPEYQVLPRXRJOEIKHBLMNUNPQZEHIKHOPVIFOTWXZWDEKXMGYDTXZWQABCJCERHLNKEOPQXQSTCHKLNKRSYLAUMTGVPHMCGIFZJKLSLNOXCFGIFMNWXEXZAJORSURYZFSHBTYOSURLVQNHRSTATVWFKNOQNUVBODXPUKOACDMRUVXUBCIVKEWBRVXUOYZAHCJKQDSMEJZDFCWGHIPIKLUZCDFXRJOEIKHBLMNUNPQZEHIKHOPVIGZBCLQTUWTABHUJDVAQUWTNXYZTDAHIOBQKUHXBDAUEFGNGIJSXAKLRETNFKAEGDXHIJQJLMVADEGDXRJZEIKHBLMNWNPQZEHIKHOPVIIMYLFPQRYRCUDITMORSTZMBVNSHWQINDHJGAFDMTMOPVMGHJGNOUEBIJPCRLDIXHEBVFGZOHJKTYBCUVWDWKZINQRTQXYERGASXNRTQKQNHRSXATVHFKNOQNUVBODXPUKOBENSVWYVDDJWLFXCSWYVPZABIBOGSTUBKGXGLOPLOQWCPIKHOPVIKLRETNFKAEGDXHIJQJLMVADEGDWXEXRAJORSURYZFSBBTYOSURLVNPMGQRSZSUVEJMNPMTUANCWOTJVYZBYFGMZOIAFVZBYSCDELEGHQACDMRUVXUBCIVKEWBRVXUOYZAHEBIJPCRLDIYCEBVFGHOHJKTYBCLQGKMJDNOPWPRSBGJKMJQRXKZTOISTUBUWXGLOPROVWCPEYQVLPRBDAHIOBQKCHXBDAUEFGNGIJSXAFOTWXZWDEKXMGYDTXZWQABCJCEYFYABKPSTVSZAGTICUZPTVSMWXNPMGQRSZSUVEJMNPMTUANCWOTJTGVPHMCGIFZJKLSLNOXCFGIFMNVYZBYFGMZOIAFVZBYSCDELEGHQGZBCLQTUWTABHUJDVAQUWTNXYZACDMRUVXUBCIVKEWBRVXUOYZAHZACZGHNAPJBGWACZTDEFMFHIRWMSFUOGLBFHUYIJKRKBNWBEFHELXVWDWYZINQRTQXYERGASXNRTQKLPMGQPSZWUVEJMNPMTUANCWOTJSWPDJLIJMNOVQTRAFIJLIPQWJYCJKJXSGEJZDFEWGBXPIDELEGHQDENVZWYVCDJWSFXCHWYVPZABIBOISTUBUWXGLOPROVWCDEYQVLPRLQOKMJDNOPWPRSLGJKYJQRXKZTRHLNKEOPQXPSTCHKLQKRSYLAUMUVWDWYZINQRDQXYERGASXNRTQKGZXCLQTUWTABHUUDVAQUWTNXYZPUXYAXEFLYNHZEUYAXRBCDKDFGEBIJPCRLDIYCEBVFGHOHJKTYBCFOTWXZWDEKXMGYDTXZWQABCJCEWXEXZAJORSURYZFSHBTYOSURLVHWQINDHJGAKLMTMOPYDGHJGNOUKLRETNFKAEGDXHIJQJLMVADEGDIMOLFPQRYRTUDILMOLSTZMBVNSMSFUOGLBFHEYIJKRKMNWBEFHELGZBCLQTUWTABHUJDVAQUWTNXYZXRJOEIKHBLMNUNPQZEHIKHOPVICJKQDSMEJZDFCWGHIPIKLUZCDFOISTUBUWXGLOPROVWCPEYQVLPRRHLNKEOPQXQSTCHKLNKRSYLAUMWXEXZAJORSURYZFSHBTYOSURLVGZBCLQTUWEABHUJDVAQUWTNXYZZACZGHNAPJBGWACZTDEFMFHIRWCJKLDSMEJZDFDWGHIPIKLUZCDFHWCINDHJGAYLMTCOPHDGHJGNOURHLNKEOPQXCSTCHKLRXRSYLAUMTGVPHMCGIFZPKLSLNOXCFGIFMNBDAHIGBQKCHXBDAUEFGNGIJSXAJTUVCJXYHJPQSPWXDQFZRWMQSPOPMGQRSZRUVEJMNPMTUANCWOTJAODMRUQDUBCIVYEMBRVTZMBVNSQNHRSTATVWFKNOQNUVBODXPUKOCJKQQSMEJZDFCWGHMPIKLUZCDFUVWDWYZINQRTQXYERGASXNRTQKIMOLFPQRYRTUDILMOLSTZMBVNSPUXYAXEFLYNHZEUYAXRBCDKDFGGZBCLQTUWTABHUJDVAQUWTNXYZBDAHIOBQKCHXBDAUEFGNGIJSXASKPFJLICMNOVOQRAFIJLIPQWJYQNHRSTATVWFKNOQNUVBODXPUKOZACZGHNAPJBGWACZTDEFMFHIRWDENSVWYVCDJWLFXCSWYVPZABIBWXEXZAJORSURYZFSHBTYOSURLVIMOLFPQRYRTUDILMOLSTZMBVNSMSFUOGLBFHEYIJKRKMNWBEFHELPUXYAXEFLYNHZEUYAXRBCDKDFGYFYABKPSTVSZAGTICUZPTVSMWXI";

		//		@SuppressWarnings("resource")
		//		FileReader fr = new FileReader("C:\\Users\\Dunca\\Documents\\School\\Software Testing and Maintance\\code\\CryptoHelper\\out.txt");
		//		out = "";
		//		int x;
		//		while((x=fr.read()) != -1)
		//			out += (char) x;


		//System.out.println("in\t>\tpin\t>\tpout\t>\tr1in\t>\tr1out\t>\trt\t>\tr2int\t>\tr2out\t>\trt\t>\tr3in\t>\tr3out\t>\trein\t>\treout\t>\tr3in\t>\tr3out\t>\trt\t>\tr2in\t>\tr2out\t>\trt\t>\tr1in\t>\tr1out\t>\trt\t>\tpin\t>\tpout\t>\tout");

		CharacterIterator iter = new StringCharacterIterator(a);

		/*
		 * Begin Black Box Equivalence Class and Boundary Value Testing Hybrid
		 */
		System.out.println("Begin Black Box Equivalence Class and Boundary Value Testing Hybrid");
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				while(iter.current() != CharacterIterator.DONE) {
					if(rotorArr[0].rotate()) {
						if(rotorArr[1].rotate()) {
							rotorArr[2].rotate();
						}
					}
					if(rotorArr[0].getStep() == 1 || rotorArr[0].getStep() == 26 || rotorArr[0].getStep() == 0 || rotorArr[0].getStep() == 16) {
						char test = pbn.encrypt(
								rotorArr[0].decrypt(
										rotorArr[1].decrypt(
												rotorArr[2].decrypt(
														rf.encrypt(
																rotorArr[2].encrypt(
																		rotorArr[1].encrypt(
																				rotorArr[0].encrypt(
																						pbn.encrypt(
																								pbn.encrypt(
																										rotorArr[0].decrypt(
																												rotorArr[1].decrypt(
																														rotorArr[2].decrypt(
																																rf.encrypt(
																																		rotorArr[2].encrypt(
																																				rotorArr[1].encrypt(
																																						rotorArr[0].encrypt(
																																								pbn.encrypt(
																																										iter.current()))))))))))))))))));
						if(test == 'A') System.out.println(rotorArr[0].getStep() + ": True");
					}
					iter.next();
				}
				iter.first();
			}
		}
		System.out.println();

		for(int i = 0; i < 3; i++)
			rotorArr[i].reset();
		/*
		 * End Black Box Equivalence Class and Boundary Value Testing Hybrid
		 */

		/*
		 * Begin Testing over every rotor position
		 */
		System.out.println("Begin Testing over every rotor position");
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				while(iter.current() != CharacterIterator.DONE) {
					if(rotorArr[0].rotate()) {
						if(rotorArr[1].rotate()) {
							rotorArr[2].rotate();
						}
					}
					char test = pbn.encrypt(
							rotorArr[0].decrypt(
									rotorArr[1].decrypt(
											rotorArr[2].decrypt(
													rf.encrypt(
															rotorArr[2].encrypt(
																	rotorArr[1].encrypt(
																			rotorArr[0].encrypt(
																					pbn.encrypt(
																							pbn.encrypt(
																									rotorArr[0].decrypt(
																											rotorArr[1].decrypt(
																													rotorArr[2].decrypt(
																															rf.encrypt(
																																	rotorArr[2].encrypt(
																																			rotorArr[1].encrypt(
																																					rotorArr[0].encrypt(
																																							pbn.encrypt(
																																									iter.current()))))))))))))))))));
					if(test == 'A') System.out.println(rotorArr[0].getStep() + ": True");
					iter.next();
				}
				iter.first();
			}
		}
		System.out.println();

		for(int i = 0; i < 3; i++)
			rotorArr[i].reset();
		/*
		 * Begin Testing over every rotor position
		 */

		/*
		 * Begin Per Rotor Testing
		 * Encrypt then decrypt to see if A is returned
		 */
		System.out.println("Begin Per Rotor Testing");
		for(int x = 0; x < 3; x++) {
			while(iter.current() != CharacterIterator.DONE) {
				char test;
				rotorArr[x].rotate();
				test = rotorArr[x].decrypt(rotorArr[x].encrypt(iter.current()));
				if(test == 'A') System.out.println(x + ": " + rotorArr[x].getStep() + ": True");

				iter.next();
			}
			iter.first();
			rotorArr[x].reset();
		}
		System.out.println();
		/*
		 * End Per Rotor Testing
		 */

		/*
		 * Begin Full System Output over every rotor step position
		 */
		System.out.println("Begin Full System Output over every rotor step position");
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				while(iter.current() != CharacterIterator.DONE) {
					if(rotorArr[0].rotate()) {
						if(rotorArr[1].rotate()) {
							rotorArr[2].rotate();
						}
					}
					//System.out.print(iter.current() + "\t>\t");
					System.out.print(
							pbn.encrypt(
									rotorArr[0].decrypt(
											rotorArr[1].decrypt(
													rotorArr[2].decrypt(
															rf.encrypt(
																	rotorArr[2].encrypt(
																			rotorArr[1].encrypt(
																					rotorArr[0].encrypt(
																							pbn.encrypt(
																									iter.current()))))))))) + "");
					iter.next();
				}
				iter.first();
			}
		}
		System.out.println();

		for(int i = 0; i < 3; i++)
			rotorArr[i].reset();

		//System.out.println("in\t>\tpin\t>\tpout\t>\tr1in\t>\tr1out\t>\trt\t>\tr2int\t>\tr2out\t>\trt\t>\tr3in\t>\tr3out\t>\trein\t>\treout\t>\tr3in\t>\tr3out\t>\trt\t>\tr2in\t>\tr2out\t>\trt\t>\tr1in\t>\tr1out\t>\trt\t>\tpin\t>\tpout\t>\tout");

		iter = new StringCharacterIterator(out);

		while(iter.current() != CharacterIterator.DONE) {
			if(rotorArr[0].rotate()) {
				if(rotorArr[1].rotate()) {
					rotorArr[2].rotate();
				}
			}
			//System.out.print(iter.current() + "\t>\t");
			System.out.print(
					pbn.encrypt(
							rotorArr[0].decrypt(
									rotorArr[1].decrypt(
											rotorArr[2].decrypt(
													rf.encrypt(
															rotorArr[2].encrypt(
																	rotorArr[1].encrypt(
																			rotorArr[0].encrypt(
																					pbn.encrypt(
																							iter.current()))))))))) + "");
			iter.next();
		}
		/*
		 * End Full System Output over every rotor step position
		 */
		
		/*
		 * System isn't ready for this test yet
		 */
		//		System.out.println();
		//		System.out.println("in\t>\tpin\t>\tpout\t>\tr1in\t>\tr1out\t>\trt\t>\tr2int\t>\tr2out\t>\trt\t>\tr3in\t>\tr3out\t>\trein\t>\treout\t>\tr3in\t>\tr3out\t>\trt\t>\tr2in\t>\tr2out\t>\trt\t>\tr1in\t>\tr1out\t>\trt\t>\tpin\t>\tpout\t>\tout");
		//
		//		iter = new StringCharacterIterator(msg);
		//
		//		for(int i = 0; i < 3; i++) {
		//			rotorArr[i].reset();
		//		}
		//
		//		while(iter.current() != CharacterIterator.DONE) {
		//			if(rotorArr[0].rotate()) {
		//				if(rotorArr[1].rotate()) {
		//					rotorArr[2].rotate();
		//				}
		//			}
		//			System.out.print(iter.current() + "\t>\t");
		//			System.out.print(
		//					pbn.encrypt(
		//							rotorArr[0].decrypt(
		//									rotorArr[1].decrypt(
		//											rotorArr[2].decrypt(
		//													rf.encrypt(
		//															rotorArr[2].encrypt(
		//																	rotorArr[1].encrypt(
		//																			rotorArr[0].encrypt(
		//																					pbn.encrypt(
		//																							iter.current()))))))))) + "\n");
		//			iter.next();
		//		}
	}

	@Override
	public void actionButtonActionPerformed(ActionEvent evt) {
		//String input = getInputText().getText();
	}
}

class Plugboard{
	private String pegs;
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	Plugboard(String pegs) {
		this.pegs = pegs;
		try {
			if(pegs.length() > 26)
				throw new Exception();
		}catch(Exception e) {
			System.out.println("Pegs string is too long. Pegs trimmed letters from the end down to a length of 26.");
			this.pegs = this.pegs.substring(0, 25);
		}

		try {
			for(int i = 1; i < pegs.length(); i++)
				for(int j = 0; j < i; j++)
					if(pegs.charAt(i) == pegs.charAt(j))
						throw new Exception();
		}catch(Exception e) {
			System.out.println("Repeat letters in the pegs string. Pegs defaulted to alphabetical order.");
			this.pegs = Plugboard.alpha;
		}
	}

	Plugboard(){
		this.pegs = Plugboard.alpha;
	}

	public char encrypt(char in) {
		//System.out.print(in + "\t>\t" + this.pegs.charAt(Plugboard.alpha.indexOf(in)) + "\t>\t"); //pin > pout
		return this.pegs.charAt(Plugboard.alpha.indexOf(in));
	}
}

abstract class Rotor{
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private int pos, dis, step = 0;

	public Rotor(){
		this.pos = 0;
		this.dis = 0;
	}

	public Rotor(int pos){
		this.pos = pos;
		this.dis = 0;
	}

	public Rotor(int pos, char start) {
		this.pos = pos;
		this.dis = Rotor.alpha.indexOf(start);
	}

	public int getPos(){
		return this.pos;
	}

	public void pos(int pos) {
		this.pos = pos;
	}

	public int getStep() {
		return this.step;
	}

	public void reset() {
		this.step = 0;
	}

	protected abstract char encrypt(char in);

	public char encrypt(char in, String left) {
		//System.out.print(alpha.charAt((alpha.indexOf(in)+step)%26) + "\t>\t"); //rin
		//System.out.print(left.charAt((alpha.indexOf(in)+step)%26) + "\t>\t"); //rout
		int index = alpha.indexOf((left.charAt((alpha.indexOf(in)+step)%26))-step);

		if(index < 0) index = (index + 26)%26;
		//System.out.print(alpha.charAt(index) + "\t>\t"); //rt

		return alpha.charAt(index);
	}

	protected abstract char decrypt(char in);

	public char decrypt(char in, String left) {
		//System.out.print(alpha.charAt((alpha.indexOf(in)+step)%26) + "\t>\t"); //rin
		//System.out.print(alpha.charAt(left.indexOf(alpha.charAt((alpha.indexOf(in)+step)%26))) + "\t>\t"); //rout
		int index = (left.indexOf(alpha.charAt((alpha.indexOf(in)+step)%26))-step);

		if(index < 0) index = (index + 26)%26;
		//System.out.print(alpha.charAt(index) + "\t>\t"); //rt

		return alpha.charAt(index);
	}

	public boolean rotate() {
		if(++step >= 26) {
			step = step%26;
			return true;
		}
		return false;
	}
}

class Rotor1 extends Rotor{
	private String left = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";

	Rotor1(){
		super();
	}

	Rotor1(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor2 extends Rotor{
	private String left = "AJDKSIRUXBLHWTMCQGZNPYFVOE";

	Rotor2(){
		super();
	}

	Rotor2(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor3 extends Rotor{
	private String left = "BDFHJLCPRTXVZNYEIWGAKMUSQO";

	Rotor3(){
		super();
	}

	Rotor3(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor4 extends Rotor{
	private String left = "ESOVPZJAYQUIRHXLNFTGKDCMWB";

	Rotor4(){
		super();
	}

	Rotor4(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor5 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";

	Rotor5(){
		super();
	}

	Rotor5(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor6 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";

	Rotor6(){
		super();
	}

	Rotor6(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor7 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";

	Rotor7(){
		super();
	}

	Rotor7(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

class Rotor8 extends Rotor{
	private String left = "VZBRGITYUPSDNHLXAWMJQOFECK";

	Rotor8(){
		super();
	}

	Rotor8(int pos){
		super(pos);
	}

	public char encrypt(char in) {
		return super.encrypt(in, this.left);
	}

	public char decrypt(char in) {
		return super.decrypt(in, this.left);
	}
}

abstract class Reflector{
	private static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	Reflector(){};

	public char encrypt(char in, String out) {
		//System.out.print(out.charAt(Reflector.alpha.indexOf(in)) + "\t>\t");
		return out.charAt(Reflector.alpha.indexOf(in));
	}

	protected abstract char encrypt(char in);
}

class ReflectorB extends Reflector{
	private String out = "YRUHQSLDPXNGOKMIEBFZCWVJAT";

	ReflectorB(){
		super();
	}

	public char encrypt(char in) {
		return super.encrypt(in, out);
	}
}

class ReflectorC extends Reflector{
	private String out = "FVPJIAOYEDRZXWGCTKUQSBNMHL";

	ReflectorC(){
		super();
	}

	public char encrypt(char in) {
		return super.encrypt(in, out);
	}
}