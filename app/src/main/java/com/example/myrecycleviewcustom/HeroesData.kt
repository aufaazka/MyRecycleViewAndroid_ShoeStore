package com.example.myrecycleviewcustom

object HeroesData {
    private val data = arrayOf(
        arrayOf(
            "Sneakers Bear",
            "Memiliki keunikan dari model sepatu ini merupakan idaman bagi para wanita dimanapun ia berada",
            "https://images.tokopedia.net/img/cache/500-square/VqbcmM/2022/1/19/af3922ec-44ac-4b56-a8c9-5f71a06d6a65.jpg"
        ),
        arrayOf(
            "Sneakers Gifly",
            "GIFLY Nesya Sepatu Sneakers Wanita Korea Import TH1618-11 Design Terbaru Sneaker Korea Produk kami adalah 100% Original Import Dengan Kualitas Terjamin",
            "https://cf.shopee.co.id/file/sg-11134201-23010-3sqzdvnlb7lv9b"
        ),
        arrayOf(
            "Sneakers Nike Air",
            "Sepatu Jordan adalah sepatu olahraga yang populer dan terkenal di seluruh dunia. Dirancang oleh perusahaan Nike untuk bintang basket Michael Jordan, sepatu ini terkenal karena desainnya yang ikonik dan performa tinggi di lapangan. Dirilis pertama kali pada tahun 1985, sepatu Jordan telah menjadi salah satu merek sepatu olahraga paling sukses dan terkenal di dunia.",
            "https://id-test-11.slatic.net/p/9602629f775eb74c8b4ee9f10d50fb9e.jpg"
        ),
        arrayOf(
            "Sneakers MNSA",
            "TERBARU !! spatu sport MNSA pria/waita terlaris/spatu sneakers terkeren saptu ini memiliki banyak kelebihan tertama untuk pemakainya.",
            "https://lzd-img-global.slatic.net/g/p/5a5f383564917e1190960a8d23cbbc50.jpg_720x720q80.jpg_.webp"
        ),
        arrayOf(
            "Sneakers Adidas Original",
            "Dengan membeli produk ini anda akan hemat biaya berkali kali lipat dan mendapat kan barang yg sama seperti yg di jual di store pada umumnya!.",
            "https://images.tokopedia.net/img/cache/500-square/product-1/2021/8/1/2688438/2688438_0dd32e8e-b88f-4bb6-8ea6-4ba179d5884b.jpg"
        ),
        arrayOf(
            "Sneakers Filla",
            "Sepatu Sangat nyaman di pakai dan pasti nya nggak gengsi bosku kuwalitas dijamin bagus bisa dipakai untuk fashion dan untuk kerja dan olahraga bosku dan barang sesuai foto kuwalitas barang dijamin tidak",
            "https://id-test-11.slatic.net/p/455d98577fa4d1d106c379154d569970.jpg"
        ),
        arrayOf(
            "Sneakers Niko Custom",
            "sepatu ini agak unik karena berkalaborasi dengan swallow dengan keunikan tersebut memiliki ciri khas untuk pemakainya.",
            "https://cdn0-production-images-kly.akamaized.net/dQO9gHKke63goRGplsSYQcerPBY=/640x853/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/4061943/original/027668700_1655969384-1_anam_chenel.jpg"
        ),
        arrayOf(
            "Sneakers Bosok",
            "Tidak hanya modelnya yang keren sepatu ini memiliki banyak sejarah yang kelam.",
            "https://thumb.viva.co.id/media/frontend/thumbs3/2022/05/12/627cfd6ef216d-sepatu-koleksi-terbaru-balenciaga_1265_711.jpg"
        ),
        arrayOf(
            "Sneakers Tupat Air",
            "Ini adalah sepatu tradisional dengan desain unik dari Finlandia. Tahukah Anda bahwa biasanya sepatu birch bark ini dipakai di atas sepatu kulit agar terlindungi dari lumpur serta salju.",
            "https://img.okezone.com/content/2018/05/04/194/1894610/sepatu-sepatu-unik-dari-berbagai-dunia-sekaligus-cara-memakainya-i2ErH32hfK.jpg"
        ),
        arrayOf(
            "Sneakers Lon",
            "Bentuknya Nyeleneh, Deretan Desain Sepatu Unik Ini Jadi Viral.",
            "https://media.dewiku.com/thumbs/2018/11/28/64455-desain-sepatu-unik-ala-mclaughlin-instagramatnicolemclaughlin/350x230-img-64455-desain-sepatu-unik-ala-mclaughlin-instagramatnicolemclaughlin.jpg"
        )
    )


    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (aData in data) {
                val hero = Hero()
                hero.name = aData[0]
                hero.from = aData[1]
                hero.photo = aData[2]


                list.add(hero)
            }


            return list
        }
}
