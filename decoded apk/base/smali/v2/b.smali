.class Lv2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/util/Locale;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/b;->a:Landroid/content/Context;

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/Locale;)Landroid/location/Geocoder;
    .locals 1

    new-instance v0, Landroid/location/Geocoder;

    if-eqz p1, :cond_0

    invoke-direct {v0, p0, p1}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0, p0}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;)V

    :goto_0
    return-object v0
.end method

.method private b(Landroid/location/Geocoder;DD)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Geocoder;",
            "DD)",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    const/4 v5, 0x5

    move-object v0, p1

    move-wide v1, p2

    move-wide v3, p4

    invoke-virtual/range {v0 .. v5}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private c(Landroid/location/Geocoder;Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Geocoder;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x5

    invoke-virtual {p1, p2, v0}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private d(Landroid/location/Geocoder;Ljava/lang/String;ILv2/a;)V
    .locals 1

    new-instance v0, Lv2/b$a;

    invoke-direct {v0, p0, p4}, Lv2/b$a;-><init>(Lv2/b;Lv2/a;)V

    invoke-virtual {p1, p2, p3, v0}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;ILandroid/location/Geocoder$GeocodeListener;)V

    return-void
.end method

.method private e(Landroid/location/Geocoder;DDILv2/a;)V
    .locals 7

    new-instance v6, Lv2/b$b;

    invoke-direct {v6, p0, p7}, Lv2/b$b;-><init>(Lv2/b;Lv2/a;)V

    move-object v0, p1

    move-wide v1, p2

    move-wide v3, p4

    move v5, p6

    invoke-virtual/range {v0 .. v6}, Landroid/location/Geocoder;->getFromLocation(DDILandroid/location/Geocoder$GeocodeListener;)V

    return-void
.end method


# virtual methods
.method f()Z
    .locals 1

    invoke-static {}, Landroid/location/Geocoder;->isPresent()Z

    move-result v0

    return v0
.end method

.method g(Ljava/lang/String;Lv2/a;)V
    .locals 3

    iget-object v0, p0, Lv2/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lv2/b;->b:Ljava/util/Locale;

    invoke-static {v0, v1}, Lv2/b;->a(Landroid/content/Context;Ljava/util/Locale;)Landroid/location/Geocoder;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x21

    if-lt v1, v2, :cond_0

    const/4 v1, 0x5

    invoke-direct {p0, v0, p1, v1, p2}, Lv2/b;->d(Landroid/location/Geocoder;Ljava/lang/String;ILv2/a;)V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-direct {p0, v0, p1}, Lv2/b;->c(Landroid/location/Geocoder;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Lv2/a;->onGeocode(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lv2/a;->onError(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method h(DDLv2/a;)V
    .locals 10

    iget-object v0, p0, Lv2/b;->a:Landroid/content/Context;

    iget-object v1, p0, Lv2/b;->b:Ljava/util/Locale;

    invoke-static {v0, v1}, Lv2/b;->a(Landroid/content/Context;Ljava/util/Locale;)Landroid/location/Geocoder;

    move-result-object v3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    const/4 v8, 0x5

    move-object v2, p0

    move-wide v4, p1

    move-wide v6, p3

    move-object v9, p5

    invoke-direct/range {v2 .. v9}, Lv2/b;->e(Landroid/location/Geocoder;DDILv2/a;)V

    goto :goto_0

    :cond_0
    move-object v2, p0

    move-wide v4, p1

    move-wide v6, p3

    :try_start_0
    invoke-direct/range {v2 .. v7}, Lv2/b;->b(Landroid/location/Geocoder;DD)Ljava/util/List;

    move-result-object p1

    invoke-interface {p5, p1}, Lv2/a;->onGeocode(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p5, p1}, Lv2/a;->onError(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method i(Ljava/util/Locale;)V
    .locals 0

    iput-object p1, p0, Lv2/b;->b:Ljava/util/Locale;

    return-void
.end method
