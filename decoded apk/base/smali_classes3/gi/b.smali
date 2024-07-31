.class public Lgi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lgi/b;->a:Ljava/util/Map;

    const-string v0, "epub"

    const-string v1, "application/epub+zip"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ogx"

    const-string v1, "application/ogg"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "odp"

    const-string v1, "application/vnd.oasis.opendocument.presentation"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "otp"

    const-string v1, "application/vnd.oasis.opendocument.presentation-template"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "yt"

    const-string v1, "application/vnd.youtube.yt"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hwp"

    const-string v1, "application/x-hwp"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "3gpp"

    const-string v1, "video/3gpp"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "3gp"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "3gpp2"

    const-string v1, "video/3gpp2"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "3g2"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "oga"

    const-string v1, "audio/ogg"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ogg"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "spx"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "dng"

    const-string v1, "image/x-adobe-dng"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cr2"

    const-string v1, "image/x-canon-cr2"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "raf"

    const-string v1, "image/x-fuji-raf"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "nef"

    const-string v1, "image/x-nikon-nef"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "nrw"

    const-string v1, "image/x-nikon-nrw"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "orf"

    const-string v1, "image/x-olympus-orf"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "rw2"

    const-string v1, "image/x-panasonic-rw2"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pef"

    const-string v1, "image/x-pentax-pef"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "srw"

    const-string v1, "image/x-samsung-srw"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "arw"

    const-string v1, "image/x-sony-arw"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ogv"

    const-string v1, "video/ogg"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "tgz"

    const-string v1, "application/x-gtar-compressed"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "taz"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "csv"

    const-string v1, "text/csv"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gz"

    const-string v1, "application/gzip"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cab"

    const-string v1, "application/vnd.ms-cab-compressed"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "7z"

    const-string v1, "application/x-7z-compressed"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "bz"

    const-string v1, "application/x-bzip"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "bz2"

    const-string v1, "application/x-bzip2"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "z"

    const-string v1, "application/x-compress"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "jar"

    const-string v1, "application/x-java-archive"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lzma"

    const-string v1, "application/x-lzma"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "xz"

    const-string v1, "application/x-xz"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "m3u"

    const-string v1, "audio/x-mpegurl"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "m3u8"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "p7b"

    const-string v1, "application/x-pkcs7-certificates"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "spc"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "p7c"

    const-string v1, "application/pkcs7-mime"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "p7s"

    const-string v1, "application/pkcs7-signature"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "es"

    const-string v1, "application/ecmascript"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "js"

    const-string v1, "application/javascript"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "json"

    const-string v1, "application/json"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ts"

    const-string v1, "application/typescript"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "perl"

    const-string v1, "text/x-perl"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pl"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pm"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "py"

    const-string v1, "text/x-python"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "py3"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "py3x"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "pyx"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "wsgi"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "rb"

    const-string v1, "text/ruby"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "sh"

    const-string v1, "application/x-sh"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "yaml"

    const-string v1, "text/x-yaml"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "yml"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "asm"

    const-string v1, "text/x-asm"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "s"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "cs"

    const-string v1, "text/x-csharp"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "azw"

    const-string v1, "application/vnd.amazon.ebook"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ibooks"

    const-string v1, "application/x-ibooks+zip"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mobi"

    const-string v1, "application/x-mobipocket-ebook"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "woff"

    const-string v1, "font/woff"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "woff2"

    const-string v1, "font/woff2"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "msg"

    const-string v1, "application/vnd.ms-outlook"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "eml"

    const-string v1, "message/rfc822"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "eot"

    const-string v1, "application/vnd.ms-fontobject"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ttf"

    const-string v1, "font/ttf"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "otf"

    const-string v1, "font/otf"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ttc"

    const-string v1, "font/collection"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "markdown"

    const-string v1, "text/markdown"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "md"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mkd"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "conf"

    const-string v1, "text/plain"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "ini"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "prop"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "rc"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "flv"

    const-string v1, "video/x-flv"

    invoke-static {v0, v1}, Lgi/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lgi/b;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static b(Ljava/io/File;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const-string v1, "application/octet-stream"

    if-gez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lgi/b;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v0

    :cond_1
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object p0

    :cond_2
    return-object v1
.end method
