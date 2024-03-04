## Önemli Kısımlar


* Paragraf tipi metinlerin düzenlenmesi
* Card kullanımı
* Resim gösterimleri üzerindeki düzenlemeler
* İkili buton sistemi kullanımı


````
@Composable
fun ArtApp() {





    Column(modifier = Modifier
        .fillMaxSize().background(Brush.linearGradient(listOf( Color(0xFF854AD9),Color(0xFFF2D43D))))
        .padding(20.dp), verticalArrangement = Arrangement.Center) {

        var currentArtIndex by remember { mutableStateOf(1) }
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


````
````
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
````



## Final View

![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/78c65fc2-f910-42af-b70e-5a0affb24929) ![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/fc23a960-f1da-4f2a-b8c2-5f9ef4f8bb64)
![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/41a6f025-9c34-402d-ab0d-b8b6692625ca) ![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/cdc4c94d-1e52-4a58-ac24-c74efc750f4c)
![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/bd7924cf-147a-4f1f-aae6-a3ba50ca5f43)![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/70648dc1-f729-4deb-847b-9bb979c289f6)


![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/f33f79d4-b84d-4d1d-aa3c-eff487b1abca)![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/7f7472aa-d6b1-464a-a363-e4b27f26bfac)

![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/72b7b4a0-4541-43a4-97b1-ef0b04121ddd)![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/8e3faf2d-e538-4a5f-98fd-cf59431af623)

![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/cd787b75-0b71-4512-90f7-4c4e78fdf5b3)![resim](https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/f71525f1-9f7b-4e47-8bc0-f837610ecb3a)


<p align="center">
  <img src="https://github.com/muhammeddincmdx/Kt11-SpaceArtApp/assets/54439858/7d1c2ade-4292-4543-9da7-2a2dd17047bf" alt="resim">
</p>



