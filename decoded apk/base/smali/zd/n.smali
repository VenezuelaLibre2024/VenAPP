.class public Lzd/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lzd/q3;

.field private b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lzb/g;Lzd/q3;Lnd/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzd/n;->a:Lzd/q3;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Lzb/g;->x()Z

    move-result p1

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lzd/n;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Lzd/m;

    invoke-direct {p1, p0}, Lzd/m;-><init>(Lzd/n;)V

    const-class p2, Lzb/b;

    invoke-interface {p3, p2, p1}, Lnd/d;->b(Ljava/lang/Class;Lnd/b;)V

    return-void
.end method

.method public static synthetic a(Lzd/n;Lnd/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/n;->e(Lnd/a;)V

    return-void
.end method

.method private c()Z
    .locals 2

    iget-object v0, p0, Lzd/n;->a:Lzd/q3;

    const-string v1, "firebase_inapp_messaging_auto_data_collection_enabled"

    invoke-virtual {v0, v1}, Lzd/q3;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private d()Z
    .locals 2

    iget-object v0, p0, Lzd/n;->a:Lzd/q3;

    const-string v1, "auto_init"

    invoke-virtual {v0, v1}, Lzd/q3;->f(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private synthetic e(Lnd/a;)V
    .locals 1

    invoke-virtual {p1}, Lnd/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzb/b;

    iget-object v0, p0, Lzd/n;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-boolean p1, p1, Lzb/b;->a:Z

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 3

    invoke-direct {p0}, Lzd/n;->d()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzd/n;->a:Lzd/q3;

    const-string v2, "auto_init"

    invoke-virtual {v0, v2, v1}, Lzd/q3;->d(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    invoke-direct {p0}, Lzd/n;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzd/n;->a:Lzd/q3;

    const-string v2, "firebase_inapp_messaging_auto_data_collection_enabled"

    invoke-virtual {v0, v2, v1}, Lzd/q3;->c(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lzd/n;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/Boolean;)V
    .locals 3

    const-string v0, "auto_init"

    if-nez p1, :cond_0

    iget-object p1, p0, Lzd/n;->a:Lzd/q3;

    invoke-virtual {p1, v0}, Lzd/q3;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lzd/n;->a:Lzd/q3;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v1, v0, p1}, Lzd/q3;->g(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method
