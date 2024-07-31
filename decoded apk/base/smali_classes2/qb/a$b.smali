.class public final Lqb/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljb/a;

.field private f:Z

.field private g:Ljb/l;

.field private h:Ljb/o;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lqb/a$b;->a:Landroid/content/Context;

    iput-object v0, p0, Lqb/a$b;->b:Ljava/lang/String;

    iput-object v0, p0, Lqb/a$b;->c:Ljava/lang/String;

    iput-object v0, p0, Lqb/a$b;->d:Ljava/lang/String;

    iput-object v0, p0, Lqb/a$b;->e:Ljb/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lqb/a$b;->f:Z

    iput-object v0, p0, Lqb/a$b;->g:Ljb/l;

    return-void
.end method

.method static synthetic a(Lqb/a$b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lqb/a$b;->a:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lqb/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lqb/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lqb/a$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lqb/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lqb/a$b;)Ljb/a;
    .locals 0

    iget-object p0, p0, Lqb/a$b;->e:Ljb/a;

    return-object p0
.end method

.method static synthetic e(Lqb/a$b;)Ljb/o;
    .locals 0

    iget-object p0, p0, Lqb/a$b;->h:Ljb/o;

    return-object p0
.end method

.method private g()Ljb/o;
    .locals 5

    iget-object v0, p0, Lqb/a$b;->g:Ljb/l;

    if-eqz v0, :cond_1

    invoke-static {}, Ljb/o;->i()Ljb/o;

    move-result-object v0

    iget-object v1, p0, Lqb/a$b;->g:Ljb/l;

    invoke-virtual {v0, v1}, Ljb/o;->a(Ljb/l;)Ljb/o;

    move-result-object v0

    invoke-virtual {v0}, Ljb/o;->d()Ljb/n;

    move-result-object v1

    invoke-virtual {v1}, Ljb/n;->i()Lvb/d0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lvb/d0;->a0(I)Lvb/d0$c;

    move-result-object v1

    invoke-virtual {v1}, Lvb/d0$c;->a0()I

    move-result v1

    invoke-virtual {v0, v1}, Ljb/o;->h(I)Ljb/o;

    move-result-object v0

    new-instance v1, Lqb/d;

    iget-object v2, p0, Lqb/a$b;->a:Landroid/content/Context;

    iget-object v3, p0, Lqb/a$b;->b:Ljava/lang/String;

    iget-object v4, p0, Lqb/a$b;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3, v4}, Lqb/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lqb/a$b;->e:Ljb/a;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Ljb/o;->d()Ljb/n;

    move-result-object v2

    iget-object v3, p0, Lqb/a$b;->e:Ljb/a;

    invoke-virtual {v2, v1, v3}, Ljb/n;->r(Ljb/q;Ljb/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljb/o;->d()Ljb/n;

    move-result-object v2

    invoke-static {v2, v1}, Ljb/c;->b(Ljb/n;Ljb/q;)V

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    const/4 p2, 0x0

    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    return-object p2

    :cond_1
    invoke-static {p0}, Lwb/k;->a(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/io/CharConversionException;

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v0

    const-string p1, "can\'t read keyset; the pref value %s is not a valid hex string"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "keysetName cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private i([B)Ljb/o;
    .locals 0

    invoke-static {p1}, Ljb/b;->b([B)Ljb/p;

    move-result-object p1

    invoke-static {p1}, Ljb/c;->a(Ljb/p;)Ljb/n;

    move-result-object p1

    invoke-static {p1}, Ljb/o;->j(Ljb/n;)Ljb/o;

    move-result-object p1

    return-object p1
.end method

.method private j([B)Ljb/o;
    .locals 3

    :try_start_0
    new-instance v0, Lqb/c;

    invoke-direct {v0}, Lqb/c;-><init>()V

    iget-object v1, p0, Lqb/a$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lqb/c;->b(Ljava/lang/String;)Ljb/a;

    move-result-object v0

    iput-object v0, p0, Lqb/a$b;->e:Ljb/a;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    invoke-static {p1}, Ljb/b;->b([B)Ljb/p;

    move-result-object v0

    iget-object v1, p0, Lqb/a$b;->e:Ljb/a;

    invoke-static {v0, v1}, Ljb/n;->n(Ljb/p;Ljb/a;)Ljb/n;

    move-result-object v0

    invoke-static {v0}, Ljb/o;->j(Ljb/n;)Ljb/o;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    invoke-direct {p0, p1}, Lqb/a$b;->i([B)Ljb/o;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    throw v0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_1
    :try_start_3
    invoke-direct {p0, p1}, Lqb/a$b;->i([B)Ljb/o;

    move-result-object p1

    invoke-static {}, Lqb/a;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    return-object p1

    :catch_5
    throw v0
.end method

.method private k()Ljb/a;
    .locals 5

    const-string v0, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {}, Lqb/a;->b()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-static {}, Lqb/a;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Android Keystore requires at least Android M"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_0
    new-instance v1, Lqb/c;

    invoke-direct {v1}, Lqb/c;-><init>()V

    :try_start_0
    iget-object v3, p0, Lqb/a$b;->d:Ljava/lang/String;

    invoke-static {v3}, Lqb/c;->d(Ljava/lang/String;)Z

    move-result v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v4, p0, Lqb/a$b;->d:Ljava/lang/String;

    invoke-virtual {v1, v4}, Lqb/c;->b(Ljava/lang/String;)Ljb/a;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    if-eqz v3, :cond_1

    invoke-static {}, Lqb/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2

    :cond_1
    new-instance v0, Ljava/security/KeyStoreException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lqb/a$b;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "the master key %s exists but is unusable"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v1

    :goto_1
    invoke-static {}, Lqb/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2
.end method


# virtual methods
.method public declared-synchronized f()Lqb/a;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqb/a$b;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-static {}, Lqb/a;->a()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lqb/a$b;->a:Landroid/content/Context;

    iget-object v2, p0, Lqb/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lqb/a$b;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lqb/a$b;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lqb/a$b;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lqb/a$b;->k()Ljb/a;

    move-result-object v1

    iput-object v1, p0, Lqb/a$b;->e:Ljb/a;

    :cond_0
    invoke-direct {p0}, Lqb/a$b;->g()Ljb/o;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Lqb/a$b;->h:Ljb/o;

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lqb/a$b;->d:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {}, Lqb/a;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {p0, v1}, Lqb/a$b;->j([B)Ljb/o;

    move-result-object v1

    goto :goto_0

    :cond_3
    :goto_1
    invoke-direct {p0, v1}, Lqb/a$b;->i([B)Ljb/o;

    move-result-object v1

    goto :goto_0

    :goto_2
    new-instance v1, Lqb/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqb/a;-><init>(Lqb/a$b;Lqb/a$a;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public l(Ljb/l;)Lqb/a$b;
    .locals 0

    iput-object p1, p0, Lqb/a$b;->g:Ljb/l;

    return-object p0
.end method

.method public m(Ljava/lang/String;)Lqb/a$b;
    .locals 1

    const-string v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lqb/a$b;->f:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqb/a$b;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot call withMasterKeyUri() after calling doNotUseKeystore()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqb/a$b;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    iput-object p1, p0, Lqb/a$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lqb/a$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lqb/a$b;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need a keyset name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
