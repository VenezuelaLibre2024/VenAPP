.class public Lbe/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzb/g;


# direct methods
.method public constructor <init>(Lzb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/z;->a:Lzb/g;

    return-void
.end method

.method public static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x40

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-eqz p0, :cond_1

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz p0, :cond_1

    array-length p1, p0

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    aget-object p0, p0, p1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lbe/z;->d(Landroid/content/pm/Signature;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_1
    :goto_0
    return-object v1
.end method

.method private static d(Landroid/content/pm/Signature;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p0

    :try_start_0
    const-string v0, "SHA1"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    invoke-static {}, Lfb/a;->a()Lfb/a;

    move-result-object v0

    invoke-virtual {v0}, Lfb/a;->n()Lfb/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfb/a;->f([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public b()Lvi/w0;
    .locals 6

    sget-object v0, Lvi/w0;->e:Lvi/w0$d;

    const-string v1, "X-Goog-Api-Key"

    invoke-static {v1, v0}, Lvi/w0$g;->e(Ljava/lang/String;Lvi/w0$d;)Lvi/w0$g;

    move-result-object v1

    const-string v2, "X-Android-Package"

    invoke-static {v2, v0}, Lvi/w0$g;->e(Ljava/lang/String;Lvi/w0$d;)Lvi/w0$g;

    move-result-object v2

    const-string v3, "X-Android-Cert"

    invoke-static {v3, v0}, Lvi/w0$g;->e(Ljava/lang/String;Lvi/w0$d;)Lvi/w0$g;

    move-result-object v0

    new-instance v3, Lvi/w0;

    invoke-direct {v3}, Lvi/w0;-><init>()V

    iget-object v4, p0, Lbe/z;->a:Lzb/g;

    invoke-virtual {v4}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lbe/z;->a:Lzb/g;

    invoke-virtual {v5}, Lzb/g;->r()Lzb/p;

    move-result-object v5

    invoke-virtual {v5}, Lzb/p;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v1, v5}, Lvi/w0;->o(Lvi/w0$g;Ljava/lang/Object;)V

    invoke-virtual {v3, v2, v4}, Lvi/w0;->o(Lvi/w0$g;Ljava/lang/Object;)V

    iget-object v1, p0, Lbe/z;->a:Lzb/g;

    invoke-virtual {v1}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-static {v1, v4}, Lbe/z;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v3, v0, v1}, Lvi/w0;->o(Lvi/w0$g;Ljava/lang/Object;)V

    :cond_0
    return-object v3
.end method

.method public c(Lvi/d;Lvi/w0;)Lpf/g$b;
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Lvi/h;

    const/4 v1, 0x0

    invoke-static {p2}, Laj/d;->a(Lvi/w0;)Lvi/h;

    move-result-object p2

    aput-object p2, v0, v1

    invoke-static {p1, v0}, Lvi/j;->b(Lvi/d;[Lvi/h;)Lvi/d;

    move-result-object p1

    invoke-static {p1}, Lpf/g;->b(Lvi/d;)Lpf/g$b;

    move-result-object p1

    return-object p1
.end method
