# پروژه استثنا هندلینگ ⛔⚠️⛔
### السَّلامُ عَلَیکُم وَ رَحْمَةُ اللّهِ و بَرَکاتهُ!
این بار می‌خوایم که استثنا‌ها رو هندل کنیم!
## exceptions package
## **classes:**
سه تا class داریم BookNotFoundException و EmptyLibraryException و InvalidBookException که چیز خاصی برای توضیح دادن ندارن ففط اومدیم توی هر کدوم استثنایی به همین نام تعریف کردیم و ورودی یه رشته برای پیام‌شون می‌گیرن!

---
## libraria package
اول از همه چرا اسم این package رو گذاشتم libraria؟<br />
چون می‌خواستم اسمش library نباشه چون یه class به همین اسم داریم و این که اسمش هم پرت نباشه و به پروژه مربوط باشه 🥰.

---
### &nbsp; Book
- دو فیلد private به اسم‌های `title` و `pageCount` تعریف می‌کنیم.
- توی کانستراکتورش می‌آیم می‌بینیم که یه وقتی title خالی نباشه یا اینکه pageCount صفر یا منفی نباشه که اگر باشه هر کدوم از اینا یه exception زیبا و فوق العاده تقدیم حضور انور کاربر گرامی بکنیم 🤩🤩 و بعدش اگه شرایط مهیا بود مقدار دهی می‌شن فیلد‌ها.
- متد `toString` رو می‌آیم override می‌کنیم تا هر وقت صداش زدیم به جای چیز میزایی که قبلا چاپ می‌کرد الان بیاد اسم کتاب و تعداد صفحات اون رو چاپ بکنه.
- متد‌های getter رو برای فیلد‌ها تعریف می‎‌کنیم.
---
### &nbsp; Library
- یه لیست private از کتاب‌ها می‌سازیم.
- متد `addBook` اول می‌آد می‌بینه که کتاب‌مون null نباشه که اگه باشه یه استثنا صادر کنه و اگه نباشه کتاب‌مون رو به لیست کتاب‌ها اضافه می‌کنه به‌ به!
- متد `findBook` ایشون کتاب‌های گم گشته رو از زیر خروارها خاک پیدا می‌کنه، نه! این متد `title` کتاب رو ‌می‌گیره می‌گرده ببینه اصلا همچین کتابی به این اسم توی لیستمون هست یا نه اگه بود که دو دستی تقدیم حضورمون می‌کنن و اگه نبود هیچی رو return می‌کنن، راستی! اگه لیستمون خدای نکرده خالی بود این متد یه exception گوگولی مگولی بهمون میده تا دهن‌مون سرویس بشه 😭😭!
- هم اکنون متد `borrowBook` ایشون اول می‌بینه که لیست خالی نباشه اگه بود exception! اگه توش چیزی بود بریم ادامه، خب می‌گیم آهای `findBook` بیا کارت دارم و اگه با اسمی که بهش دادیم کتاب یافت که یافت نیافت null رو داریم که منجر به یه exception دیگه می‌شه (بسهههههههه چقدر exception کمک! 😶‍🌫️😶‍🌫️) اگه اتفاق بدی پیش نیومد دیگه با موفقیت کتاب دلخواه borrow می‌شه 😁.
- هنوز مونده! متد `returnBook` این کتاب رو پس می‌ده اگه اسم کتاب رو درست داده باشی و `findBook` عزیز null تقدیم نکنه که بعدش استثنا بارون بشیم با موفقیت کتاب به کتابخانه باز می‌گردد.
- و در آخر متد `listBook` ایشون می‌گه هی لیست خالی‌ای یا نه اگه خالی‌ای که یه استثنا بدم دهن کاربر سرویس بشه اگه خالی نیستی بیا کل کتاب های تو لیست رو با متد `toString` که قبلا خودمون override کردیم‌اش مشخصات‌شون رو چاپ کن.
- هاها! شوخی کردم، قبلی آخری نبود! (وای، چقدر بامزه‌ام! 🥰🥰🥰) این آخری هست چون لیستمون private هست براش یه getter تعریف می‌کنیم!
---
## Main
#### رسیدیم و رسیدیم کاشکی نمی‌رسیدیم!
- یک کد از quera کپی و سپس الصاق (عربی 😊🥰) می‌نماییم.
- خیلی جالبه چون الان اومدیم هرچی استثنا بود هندل کردیم چطوری؟؟؟ به این شکل که اومدیم اون خط هایی بودن که محتمل بود یه exception به ما نشون بدن، اون‎‌ها رو گرفتیم انداختیم توی بلوکات (هاهاها جمع مکسر بلوک 😁) try-catch تا اگه چشم‌تون روز بد نبینه استثنا صادر شد سریعا متناسب با اون استثنا یه پیام مناسب چاپ بشه!
- همین! چیز دیگه‌ای نمونده 😄.

## خروجی کد:
```
Library is empty.

Page count must be positive.
Title cannot be empty.
Title cannot be empty.

Book should not be null.
Book should not be null.
Book should not be null.

Books in the library:
Java Programming (300 pages)

book was successfully borrowed.
Java Programming (300 pages)

Cannot return. Book with title Clean Code not found.
book was successfully returned.
Java Programming (300 pages)
```
متاسفانه این بار شرکت‌های حقوقی و اشخاص حقیقی اسپانسر بنده نشدن 💔💔 انشالله پروژه های بعدی.
### فی أمان الله!
