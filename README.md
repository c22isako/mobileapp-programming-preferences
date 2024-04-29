
# Rapport

**Skriv din rapport här!**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.


Lade till kod från canvas, som skapar en reference, och en editor. Därefter la jag även till information för att använda
referensen, för att kunna läsa data. Lade även till en TextView och en knapp i mainActivitys xml fil. Knappen kommer användas
för att ta sig vidare till SecondActivity, och TextView för att visa upp den "sparade" datan.
```
  private Button SeccondAcitivityButton;
  private SharedPreferences myPreferenceRef;
```
```
private SharedPreferences myPreferenceRef;
private SharedPreferences.Editor myPreferenceEditor;

 myPreferenceRef = getPreferences(MODE_PRIVATE);
        myPreferenceEditor = myPreferenceRef.edit();

        TextView prefTextRef=new TextView(this);
        prefTextRef=(TextView)findViewById(R.id.prefText);
        prefTextRef.setText(myPreferenceRef.getString("MyAppPreferenceString", "No preference found."));
```
Därefter skapade jag en ny empty views activity, SecondActivity, och lägger in EditText, samt en button i dess xml fil. Jag tog även bort överflödig kod för att passa projektets ändamål. 
Notera att dessa kodrader kommer från canvas. Eftersom canvas koden även inkluderade ett id som kräver en variabel i string-filen ("save" på button), lades denna till. 
Denna kommer användas senare i projektet.

Vi skapade en button i MainActivity, och dess xml fil, och lade sedan till en buttonListener till denna i main. Denna ska 
leda oss till den andra acitvityn i ett senare skede.
```
SeccondAcitivityButton.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
```
Fixade gradle-versioner via build.gradle, där vi ändrade från '1.8.0' till 1.1.0. Detta eftersom den krånglade efter att vi lade till
en ny activity.
```
implementation 'androidx.activity:activity:1.1.0'
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
