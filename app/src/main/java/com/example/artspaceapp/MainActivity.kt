package com.example.artspaceapp

import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.Menu
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.palette.graphics.Palette
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtApp()
                }
            }
        }
    }
}

@Composable
fun ArtApp() {





    Column(modifier = Modifier
        .fillMaxSize().background(Brush.linearGradient(listOf( Color(0xFF854AD9),Color(0xFFF2D43D))))
        .padding(20.dp), verticalArrangement = Arrangement.Center) {

        var currentArtIndex by remember { mutableStateOf(8) }
        /*
        EiffelExplanation()
        HagisophiaExplanation()
        SagradeExplanation()
        BigBenExplanation()
        SydneyOperaExplanation()
        BurjKhalifaExplanation()
        EmpireStateExplanation()
        GizaExplanation()
        CollosseumExplanation()
        NotreDameExplanation()
        ParthenonExplanation()
        PetronasExplanation()
        TajMahalExplanation()
         */
        when(currentArtIndex){
            1 -> EiffelExplanation()
            2 -> HagisophiaExplanation()
            3 -> SagradeExplanation()
            4 -> BigBenExplanation()
            5 -> SydneyOperaExplanation()
            6 -> BurjKhalifaExplanation()
            7 -> EmpireStateExplanation()
            8 -> GizaExplanation()
            9 -> CollosseumExplanation()
            10 -> NotreDameExplanation()
            11 -> ParthenonExplanation()
            12 -> PetronasExplanation()
            else -> TajMahalExplanation()
        }




        Spacer(modifier = Modifier.height(15.dp))

        OutlinedCard {
            Row (modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                ElevatedButton(onClick = {
                    if (currentArtIndex>1){
                        currentArtIndex--

                    } }) {
                    Text(text = "Previos")
                }
                Spacer(modifier = Modifier
                    .width(35.dp)
                    .height(20.dp))
                ElevatedButton(onClick = {
                    if (currentArtIndex<13){
                        currentArtIndex++
                    }
                }) {
                    Text(text = " Next  ")
                }
            }
        }


    }
}


@Composable
fun TajMahalExplanation(){
    val image = painterResource(id = R.drawable.tacmahal)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            Box(modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(20.dp, shape = RectangleShape)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column (modifier = Modifier.padding(5.dp)){
        Text(
            buildAnnotatedString {
                withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                    withStyle(style = SpanStyle(color = Color.Black, fontWeight = FontWeight.Light, fontSize = 32.sp)) {
                        append("Taj Mahal\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold, color = Color.DarkGray, fontSize =20.sp
                        )
                    ) {
                        append("Agra/India (1631)\n")
                    }


                }
                withStyle(style= ParagraphStyle(lineHeight = 14.sp)){
                    withStyle(style =SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)){
                        append("The Taj Mahal, located in Agra, India, is a breathtaking white marble mausoleum built by Mughal emperor Shah Jahan in memory of his third wife Mumtaz Mahal.\nCompleted in 1643, this architectural masterpiece exemplifies Mughal style, blending elements of Persian, Islamic, and Indian architectural traditions.\nConsidered a symbol of eternal love and intricate craftsmanship, the Taj Mahal attracts millions of visitors each year, standing as a testament to Shah Jahan's devotion and Mughal artistic brilliance.")
                    }
                }
            }
        )


            }
        }
    }
}


@Composable
fun SydneyOperaExplanation(){
    val image = painterResource(id = R.drawable.sidneyopera)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            Box(modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(20.dp, shape = RectangleShape)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column (modifier = Modifier.padding(5.dp)){
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Sydney Opera House\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Sydney/Australia (1959)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Sydney Opera House, nestled on the Sydney Harbour, is an architectural marvel recognized worldwide for its distinctive shell-like roof design.\nCompleted in 1973, this multi-venue performing arts center consists of several concrete \"shells\" clad in matte white ceramic tiles.\nDesigned by Danish architect Jørn Utzon, the building's unconventional shape sparked controversy during its construction but has since become an iconic symbol of Sydney and a UNESCO World Heritage Site.")
                            }
                        }
                    }
                )

            }
        }
    }
}


@Composable
fun PetronasExplanation(){
    val image = painterResource(id = R.drawable.petronastowers)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            Box(modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(20.dp, shape = RectangleShape)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column (modifier = Modifier.padding(5.dp)){
        Text(
            buildAnnotatedString {
                withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                    withStyle(style = SpanStyle(color = Color.Black, fontWeight = FontWeight.Light, fontSize = 32.sp)) {
                        append("Petronas Twin Towers\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold, color = Color.DarkGray, fontSize =20.sp
                        )
                    ) {
                        append("Kuala Lumpur/Malaysia (1993)\n")
                    }


                }
                withStyle(style= ParagraphStyle(lineHeight = 14.sp)){
                    withStyle(style =SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)){
                        append("Soaring above Kuala Lumpur, Malaysia, the Petronas Twin Towers held the title of the world's tallest twin towers from 1998 to 2004.\nReaching a height of 452 meters (1,483 feet) each, these postmodern skyscrapers boast a unique design inspired by Islamic geometric patterns and traditional Malaysian motifs.\nThe towers are not just visually striking but also house office space, a concert hall, and an art gallery, serving as a prominent landmark and a symbol of Malaysia's economic and technological advancement.")
                    }
                }
            }
        )


            }
        }
    }
}







@Composable
fun ParthenonExplanation(){
    val image = painterResource(id = R.drawable.parthenon)
    OutlinedCard(
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Parthenon\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Athens/Greece (BC. 447)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Perched atop the Acropolis in Athens, Greece, the Parthenon stands as a magnificent testament to ancient Greek architecture and art.\nCompleted in 438 BC, this Doric temple was dedicated to the Greek goddess Athena and housed a colossal gold and ivory statue of the deity.\nThe Parthenon's iconic features, including its sculpted friezes and marble columns, celebrate Greek mythology and artistic achievements, making it a timeless symbol of their civilization and cultural legacy.")
                            }
                        }
                    }
                )

            }
        }
    }
}



@Composable
fun NotreDameExplanation(){
    val image = painterResource(id = R.drawable.notredame)
    OutlinedCard(
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Notre-Dame\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Paris/France (1163)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Notre Dame Cathedral, located in the heart of Paris, France, is a stunning example of French Gothic architecture.\nOriginally constructed between the 12th and 14th centuries, its iconic features include flying buttresses, stained glass windows, and gargoyles.\nBeyond its architectural beauty, Notre Dame holds immense cultural and religious significance, serving as a place of worship and a symbol of Parisian history and identity.\nUnfortunately, a major fire in 2019 caused significant damage to the cathedral, and restoration efforts are currently underway.")
                            }
                        }
                    }
                )

            }
        }
    }
}

@Composable
fun CollosseumExplanation(){
    val image = painterResource(id = R.drawable.kolezyum)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            Box(modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(20.dp, shape = RectangleShape)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column (modifier = Modifier.padding(5.dp)){
        Text(
            buildAnnotatedString {
                withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                    withStyle(style = SpanStyle(color = Color.Black, fontWeight = FontWeight.Light, fontSize = 32.sp)) {
                        append("Collosseum\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold, color = Color.DarkGray, fontSize =20.sp
                        )
                    ) {
                        append("Roma/Italy (AD. 72)\n")
                    }


                }
                withStyle(style= ParagraphStyle(lineHeight = 14.sp)){
                    withStyle(style =SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)){
                        append("The Colosseum, also known as the Flavius Amphitheatre, stands as an awe-inspiring remnant of ancient Rome.\nConstructed between 70 and 80 AD, it was the largest amphitheater ever built in the Roman Empire, capable of holding an estimated 50,000 spectators.\nIts purpose was to host gladiatorial combats, public executions, animal hunts, and other spectacles, serving as a center of entertainment and public gathering for centuries.\nToday, the Colosseum remains a popular tourist destination and a powerful symbol of Roman engineering and historical significance.")

                    }
                }
            }
        )


            }
        }
    }
}



@Composable
fun GizaExplanation(){
    val image = painterResource(id = R.drawable.gize)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            Box(modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(20.dp, shape = RectangleShape)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column (modifier = Modifier.padding(5.dp)){
        Text(
            buildAnnotatedString {
                withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                    withStyle(style = SpanStyle(color = Color.Black, fontWeight = FontWeight.Light, fontSize = 32.sp)) {
                        append("Pyramids of Giza\n")
                    }
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold, color = Color.DarkGray, fontSize =20.sp
                        )
                    ) {
                        append("Giza Plateau/Egypt (BC. 2560)\n")
                    }


                }
                withStyle(style= ParagraphStyle(lineHeight = 14.sp)){
                    withStyle(style =SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)){
                        append("Giza, located on the Giza Plateau in Egypt, is most famous for its three iconic pyramids: the Great Pyramid of Giza, the Pyramid of Khafre, and the Pyramid of Menkaure.\nThese monumental structures, built as tombs for pharaohs during the Old Kingdom (2686–2181 BC), are considered some of the most ancient and impressive wonders of the world.\nGiza also encompasses other significant structures like the Great Sphinx, a monumental limestone statue with a human head and a lion's body, further enriching the site's historical and cultural significance.")

                    }
                }
            }
        )


            }
        }
    }

}

@Composable
fun EmpireStateExplanation(){
    val image = painterResource(id = R.drawable.empirestate)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Empire State\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Manhattan/USA (1930)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("The Empire State Building, a towering Art Deco skyscraper in New York City, stands at 1,250 feet tall, making it one of the most iconic landmarks in the world.\nOpened in 1931, it briefly held the title of the world's tallest building until the construction of the World Trade Center towers in the 1970s.\nDespite this, the Empire State Building remains a beloved symbol of New York City's skyline and resilience, offering breathtaking panoramic views and serving as a popular tourist destination.")

                            }
                        }
                    }
                )

            }
        }
    }
}

@Composable
fun BurjKhalifaExplanation(){
    val image = painterResource(id = R.drawable.burjkhalifa)

    OutlinedCard(
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Burj Khalifa\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Dubai/UAE (2004)\n")
                            }
                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Soaring high above Dubai, the Burj Khalifa holds the title of the world's tallest building at a staggering 828 meters (2,717 feet).\nThis architectural marvel, inaugurated in 2010, boasts a sleek and modern design inspired by the Hymenocallis flower, a regional desert bloom.\nOffering breathtaking panoramic views from observation decks throughout the tower, the Burj Khalifa serves as a prominent landmark and a symbol of Dubai's innovation and ambition.")
                            }
                        }
                    }
                )
            }
        }
    }

}



@Composable
fun BigBenExplanation(){
    val image = painterResource(id = R.drawable.bigben)
    OutlinedCard(
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Big Ben\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("London/England (1859)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Big Ben, officially known as the Elizabeth Tower, is the iconic clock tower located at the Palace of Westminster in London, England.\nCompleted in 1859, it stands at an impressive 316 feet tall and houses the Great Bell, whose deep chime has become synonymous with London and the UK.\n Big Ben is not only a functioning clock but also a beloved landmark, a symbol of British history and tradition.")

                            }
                        }
                    }
                )

            }
        }
    }
}


@Composable
fun SagradeExplanation(){
    val image = painterResource(id = R.drawable.sagrefamilia)
    OutlinedCard(
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Sagrada Família\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Barcelona/Spain (1882)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("The Sagrada Família, meaning \"Holy Family,\" is a majestic Roman Catholic church under construction in Barcelona, Spain.\nDesigned by the renowned architect Antoni Gaudí, its unique and intricate facade showcases his distinctive style inspired by nature.\nThough not yet finished, construction began in 1882 and continues to this day, making it a fascinating testament to architectural ambition and Gaudí's enduring legacy.")

                            }
                        }
                    }
                )

            }
        }
    }
}



@Composable
fun HagisophiaExplanation(){
    val image = painterResource(id = R.drawable.ayasofya)
    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(16.dp))
                    .shadow(20.dp, shape = RectangleShape)
            ) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column(modifier = Modifier.padding(5.dp)) {
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Black,
                                    fontWeight = FontWeight.Light,
                                    fontSize = 25.sp
                                )
                            ) {
                                append("Hagia Sophia Grand Mosque\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold,
                                    color = Color.DarkGray,
                                    fontSize = 20.sp
                                )
                            ) {
                                append("Istanbul/Turkiye (AD. 537)\n")
                            }


                        }
                        withStyle(style = ParagraphStyle(lineHeight = 14.sp)) {
                            withStyle(
                                style = SpanStyle(
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Normal
                                )
                            ) {
                                append("Hagia Sophia Grand Mosque, originally the Hagia Sophia (\"Holy Wisdom\") church, stands as a landmark in Istanbul's historic center.\nBuilt in the 6th century as a Byzantine basilica, it became a mosque after the Ottoman conquest in 1453.\nNotably, it served as both a church and a mosque for centuries, reflecting the city's rich cultural and religious history.")

                            }
                        }
                    }
                )
            }
        }

    }
}



@Composable
fun EiffelExplanation(){



    val image = painterResource(id = R.drawable.paris)

    OutlinedCard(
    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            Box(modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(20.dp, shape = RectangleShape)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
            }
            Column (modifier = Modifier.padding(5.dp)){
                Text(
                    buildAnnotatedString {
                        withStyle(style = ParagraphStyle(lineHeight = 17.sp,)) {
                            withStyle(style = SpanStyle(color = Color.Black, fontWeight = FontWeight.Light, fontSize = 32.sp)) {
                                append("Eiffel Tower\n")
                            }
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Bold, color = Color.DarkGray, fontSize =20.sp
                                )
                            ) {
                                append("Paris/France (1899)\n")
                            }


                        }
                        withStyle(style= ParagraphStyle(lineHeight = 14.sp)){
                            withStyle(style =SpanStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal)){
                                append("The Eiffel Tower is a wrought-iron lattice tower on the Champ de Mars in Paris, France.\nIt is named after the engineer Gustave Eiffel, whose company designed and built the tower from 1887 to 1889.\nThe tower is the tallest structure in Paris and the most-visited paid monument in the world; 6.91 million people ascended it in 2015.\nThe tower received its 250 millionth visitor in 2010. ")

                            }
                        }
                    }
                )
            }


        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArtSpaceAppTheme {
        ArtApp()
    }
}