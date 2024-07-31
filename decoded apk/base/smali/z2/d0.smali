.class public Lz2/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/location/LocationManager;

.field private final c:Lz2/z;

.field private d:Landroid/location/OnNmeaMessageListener;

.field private e:Ljava/lang/String;

.field private f:Ljava/util/Calendar;

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz2/z;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/d0;->g:Z

    iput-object p1, p0, Lz2/d0;->a:Landroid/content/Context;

    iput-object p2, p0, Lz2/d0;->c:Lz2/z;

    const-string p2, "location"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/LocationManager;

    iput-object p1, p0, Lz2/d0;->b:Landroid/location/LocationManager;

    new-instance p1, Lz2/c0;

    invoke-direct {p1, p0}, Lz2/c0;-><init>(Lz2/d0;)V

    iput-object p1, p0, Lz2/d0;->d:Landroid/location/OnNmeaMessageListener;

    return-void
.end method

.method public static synthetic a(Lz2/d0;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lz2/d0;->c(Ljava/lang/String;J)V

    return-void
.end method

.method private synthetic c(Ljava/lang/String;J)V
    .locals 0

    const-string p2, "$GPGGA"

    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iput-object p1, p0, Lz2/d0;->e:Ljava/lang/String;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    iput-object p1, p0, Lz2/d0;->f:Ljava/util/Calendar;

    :cond_0
    return-void
.end method


# virtual methods
.method public b(Landroid/location/Location;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/d0;->e:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lz2/d0;->c:Lz2/z;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lz2/d0;->g:Z

    if-eqz v0, :cond_3

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xd

    const/4 v2, -0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    iget-object v1, p0, Lz2/d0;->f:Ljava/util/Calendar;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lz2/d0;->c:Lz2/z;

    invoke-virtual {v0}, Lz2/z;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lz2/d0;->e:Ljava/lang/String;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "$GPGGA"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    array-length v1, v0

    const/16 v2, 0x9

    if-le v1, v2, :cond_3

    aget-object v1, v0, v2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    aget-object v0, v0, v2

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-nez v2, :cond_2

    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    invoke-virtual {p1, v2}, Landroid/location/Location;->setExtras(Landroid/os/Bundle;)V

    :cond_2
    invoke-virtual {p1}, Landroid/location/Location;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v2, "geolocator_mslAltitude"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    :cond_3
    return-void
.end method

.method public d()V
    .locals 3

    iget-boolean v0, p0, Lz2/d0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lz2/d0;->c:Lz2/z;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lz2/z;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lz2/d0;->b:Landroid/location/LocationManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lz2/d0;->d:Landroid/location/OnNmeaMessageListener;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->addNmeaListener(Landroid/location/OnNmeaMessageListener;Landroid/os/Handler;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/d0;->g:Z

    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lz2/d0;->c:Lz2/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz2/z;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/d0;->b:Landroid/location/LocationManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lz2/d0;->d:Landroid/location/OnNmeaMessageListener;

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeNmeaListener(Landroid/location/OnNmeaMessageListener;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/d0;->g:Z

    :cond_0
    return-void
.end method
