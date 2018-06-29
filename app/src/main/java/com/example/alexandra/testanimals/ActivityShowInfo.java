package com.example.alexandra.testanimals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class ActivityShowInfo extends AppCompatActivity {
    /**
     * Called when the activity is first created.
     */
    InterstitialAd mInterstitialAd;
    TextView nameView,textView;
    ImageView iView;
    int[] images = {R.drawable.lynx,R.drawable.fox,R.drawable.sleopard,R.drawable.btiger,R.drawable.panda,
            R.drawable.kangaroo,R.drawable.koala,R.drawable.echidna,R.drawable.dingo,R.drawable.wombat,
            R.drawable.penguin,R.drawable.seal,R.drawable.whale,
            R.drawable.hseal,R.drawable.bbear,R.drawable.groundhog,R.drawable.pronghorn,R.drawable.alligator,
            R.drawable.jaguar,R.drawable.sloth,R.drawable.guanaco,R.drawable.capybara,R.drawable.anteater,
            R.drawable.lion,R.drawable.elephant,R.drawable.buffalo,R.drawable.leopard,R.drawable.rhinoceros
    };
    String[] textes = {"The Eurasian lynx is a solitary animal; a secretive creature that prefers dense forests full of hiding places and stalking opportunities.", "The red fox in particular is extremely skilled at adapting to almost any environment. They have succeeded and thrived in close proximity to human beings and there are even some sub-species of red fox that live in heavy urban environments, taking advantage of their naturally nocturnal tendencies.", "The snow leopard’s powerful build allows it to scale great steep slopes with ease. Its hind legs give the snow leopard the ability to leap six times the length of its body. A long tail provides balance and agility and also wraps around the resting snow leopard as protection from the cold.", "he Bengal tiger is found primarily in India with smaller populations in Bangladesh, Nepal, Bhutan, China and Myanmar. It is the most numerous of all tiger subspecies with more than 2,500 left in the wild. The creation of India’s tiger reserves in the 1970s helped to stabilize numbers, but poaching to meet a growing demand from Asia in recent years has once again put the Bengal tiger at risk.", "Pandas live mainly in bamboo forests high in the mountains of western China, where they subsist almost entirely on bamboo. They must eat from 26 to 84 pounds of it every day, a formidable task for which they use their enlarged wrist bones that function as opposable thumbs.",
            "Kangaroos possess powerful hind legs, a long, strong tail, and small front legs. Kangaroos belong to the animal family Macropus, literally \"big foot\".", "Koalas live in eastern Australia, where the eucalyptus trees they love are most plentiful. In fact, they rarely leave these trees, and their sharp claws and opposable digits easily keep them aloft. During the day they doze, tucked into forks or nooks in the trees, sleeping for up to 18 hours.", "Echidnas are known better as spiny anteaters, although they are not related to them, besides that fact that both anteaters and echidnas eat ants and termites. The echidna is found in parts of New Guinea and Australia.", "The dingo is medium-sized canine natively found on the Australian continent and even into South-East Asia. The dingo is thought to have once been a domestic dog that has returned to living in the wild now for thousands of years.", "The wombat is a medium sized marsupial that is found only in Australia and it's surrounding islands. Wombats are burrowing mammals that spend most of the day underground, coming out at night to feed.",
            "Penguins are aquatic, flightless birds that are highly adapted to life in the water. Their distinct tuxedo-like appearance is called countershading, a form of camouflage that helps keep them safe in the water. ", "The common seal tends to be found in colder waters in many places around the world. Many species of seal inhabit waters in the northern hemisphere and are often found in coastal waters where there is an abundance of food and fewer number of predators.", "Blue whales are the largest animals ever known to have lived on Earth. These magnificent marine mammals rule the oceans at up to 100 feet long and upwards of 200 tons.",
            "Hawaiian monk seals live in the remote Northwestern Hawaiian Islands. These small islands and atolls are either uninhabited or little-used by humans. ", "The Black Bear (also known as the American Black Bear) is a medium sized species of bear that is found inhabiting a variety of forested habitats across North America. ", "The groundhog, or woodchuck, is one of 14 species of marmots. These rodents live a feast-or-famine lifestyle and gorge themselves all summer to build up plentiful reserves of fat. ", "Fleet-footed pronghorns are among the speediest animals in North America. They can run at more than 53 miles an hour, leaving pursuing coyotes and bobcats in the dust.", "Alligators are in the same family as other large reptiles like Crocodiles but are native to only two countries, which are the southern USA and China (where the Alligator is now nearly extinct).",
            "The Jaguar is the largest feline on the American continent, and is the only one of the world's 'big' cats to be found in the New World. Jaguars are closely related to Leopards and have a number of similar characteristics including the distinctive spotted pattern on their fur.", "Sloths are tree-dwelling mammals that pass their time sleeping and eating. The sloth happily eats both plants and insects, and occasionally small reptiles and birds.", "Guanacos are graceful animals related to camels. Pronounced \"gwa NAH ko,\" they live throughout South America in dry, open country in the mountains or on the plains. Guanacos have a calm attitude, so people started to domesticate them for use as pack animals.", "The Capybara is a large, semi-aquatic rodent that is found inhabiting the water-logged regions of Central and South America. Closely related to other South American rodents such as Chinchillas and Guinea Pigs, the Capybara is the largest rodent in the world weighing up to 75kg and measuring nearly 1.4 meters long.", "Its name is a hint to one of its favorite foods, and you can't miss its long snout, but there's more to the story of the giant anteater! This unique animal is the largest of the three anteater species (the other two are the tamandua or lesser anteater and the silky anteater). The giant anteater is about the size of a golden retriever, but thick, bushy hair makes it look even bigger. ",
            "The Lion is one of the largest, strongest and powerful felines in the world second only in size to the Siberian Tiger. They are the largest cats on the African continent and are unique among felines in a number of ways but the biggest difference between Lions and other cats is that they are incredibly sociable animals that live together in family groups known as prides. ", "The elephant is the only known mammal that, despite having knee joints, cannot jump! This is thought to be primarily due to the elephant's sheer size but also because of the way that the elephant's legs are built, they are short and stocky to support the elephant's phenomenal weight.", "The American buffalo is one of the icons of the United States of America and, along with the bald eagle, can be found depicted on various coins and flags throughout the nations history.", "The Leopard is a medium-sized wildcat that is natively found in a variety of different habitats across sub-Saharan Africa and southern Asia. A member of the \"Big Cat\" family, the Leopard is an agile and opportunistic hunter that has been able to exploit habitats unused by other large felines as it spends a great deal of its time high in the tree branches. ", "The rhinoceros is a large mammal native to Africa and Asia. There are five species of rhino found in the world with 3 out of the 5 species of rhino now considered to be critically endangered. The rhinoceros is a large mammal native to Africa and Asia. There are five species of rhino found in the world with 3 out of the 5 species of rhino now considered to be critically endangered.The rhinoceros is a large mammal native to Africa and Asia. There are five species of rhino found in the world with 3 out of the 5 species of rhino now considered to be critically endangered.The rhinoceros is a large mammal native to Africa and Asia. There are five species of rhino found in the world with 3 out of the 5 species of rhino now considered to be critically endangered."
    };
    String[] names = {"Lynx", "Urban Fox", "Snow Leopard", "Bengal Tiger", "Panda",
            "Kangaroo", "Koala", "Echidna", "Dingo", "Wombat",
            "Penguin", "Seal", "Whale",
            "Hawaiian Monk Seal", "American Black Bear", "Groundhog", "Pronghorn", "American Alligator",
            "Jaguar", "Sloth", "Guanaco", "Capybara", "Giant Anteatr",
            "Lion", "African Elephant", "Cape Buffalo", "Leopard", "Rhinoceros"
    };
    boolean flag=false;
    int i= 0;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last);

        nameView=  (TextView) findViewById(R.id.name);
        textView=  (TextView) findViewById(R.id.textView);
        iView=  (ImageView) findViewById(R.id.imageView);
        mInterstitialAd = new InterstitialAd(this);

        // set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.ad_unit_id));

        AdRequest adRequest = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(adRequest);



        if (savedInstanceState == null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                     while (i<names.length && !flag){
                    if (bundle.containsKey(names[i])) {
                        nameView.setText(names[i]);
                        textView.setText(textes[i]);
                        iView.setImageResource(images[i]);
                        flag=true;
                        } else
                         i++;
                    }
                }
            }
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });
    }
    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

}
