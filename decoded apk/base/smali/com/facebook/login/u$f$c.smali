.class public final Lcom/facebook/login/u$f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/u$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/login/u$f$c;-><init>()V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/login/u$f$c;Lcom/facebook/login/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/login/u$f;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/login/u$f$c;->c(Lcom/facebook/login/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/u$f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/facebook/login/u$e;Ljava/lang/String;)Lcom/facebook/login/u$f;
    .locals 7

    new-instance v6, Lcom/facebook/login/u$f;

    sget-object v2, Lcom/facebook/login/u$f$a;->CANCEL:Lcom/facebook/login/u$f$a;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/login/u$f;-><init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public final b(Lcom/facebook/login/u$e;Li4/a;Li4/i;)Lcom/facebook/login/u$f;
    .locals 8

    new-instance v7, Lcom/facebook/login/u$f;

    sget-object v2, Lcom/facebook/login/u$f$a;->SUCCESS:Lcom/facebook/login/u$f$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/login/u$f;-><init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Li4/i;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public final c(Lcom/facebook/login/u$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/login/u$f;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string p2, ": "

    invoke-static {p2, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v5

    new-instance p2, Lcom/facebook/login/u$f;

    sget-object v3, Lcom/facebook/login/u$f$a;->ERROR:Lcom/facebook/login/u$f$a;

    const/4 v4, 0x0

    move-object v1, p2

    move-object v2, p1

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/facebook/login/u$f;-><init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method

.method public final e(Lcom/facebook/login/u$e;Li4/a;)Lcom/facebook/login/u$f;
    .locals 7

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/login/u$f;

    sget-object v3, Lcom/facebook/login/u$f$a;->SUCCESS:Lcom/facebook/login/u$f$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/facebook/login/u$f;-><init>(Lcom/facebook/login/u$e;Lcom/facebook/login/u$f$a;Li4/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
