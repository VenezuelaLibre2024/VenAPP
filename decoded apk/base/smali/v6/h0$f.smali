.class public final Lv6/h0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field private a:Lv6/h;

.field private b:Lv6/j;

.field private c:Z

.field private d:Z

.field private e:I

.field f:Lv6/h0$e;

.field g:Lt6/y$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv6/h;->c:Lv6/h;

    iput-object v0, p0, Lv6/h0$f;->a:Lv6/h;

    const/4 v0, 0x0

    iput v0, p0, Lv6/h0$f;->e:I

    sget-object v0, Lv6/h0$e;->a:Lv6/h0$e;

    iput-object v0, p0, Lv6/h0$f;->f:Lv6/h0$e;

    return-void
.end method

.method static synthetic a(Lv6/h0$f;)Lv6/h;
    .locals 0

    iget-object p0, p0, Lv6/h0$f;->a:Lv6/h;

    return-object p0
.end method

.method static synthetic b(Lv6/h0$f;)Lv6/j;
    .locals 0

    iget-object p0, p0, Lv6/h0$f;->b:Lv6/j;

    return-object p0
.end method

.method static synthetic c(Lv6/h0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lv6/h0$f;->c:Z

    return p0
.end method

.method static synthetic d(Lv6/h0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lv6/h0$f;->d:Z

    return p0
.end method

.method static synthetic e(Lv6/h0$f;)I
    .locals 0

    iget p0, p0, Lv6/h0$f;->e:I

    return p0
.end method


# virtual methods
.method public f()Lv6/h0;
    .locals 2

    iget-object v0, p0, Lv6/h0$f;->b:Lv6/j;

    if-nez v0, :cond_0

    new-instance v0, Lv6/h0$h;

    const/4 v1, 0x0

    new-array v1, v1, [Lv6/i;

    invoke-direct {v0, v1}, Lv6/h0$h;-><init>([Lv6/i;)V

    iput-object v0, p0, Lv6/h0$f;->b:Lv6/j;

    :cond_0
    new-instance v0, Lv6/h0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv6/h0;-><init>(Lv6/h0$f;Lv6/h0$a;)V

    return-object v0
.end method

.method public g(Lv6/h;)Lv6/h0$f;
    .locals 0

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv6/h0$f;->a:Lv6/h;

    return-object p0
.end method

.method public h(Z)Lv6/h0$f;
    .locals 0

    iput-boolean p1, p0, Lv6/h0$f;->d:Z

    return-object p0
.end method

.method public i(Z)Lv6/h0$f;
    .locals 0

    iput-boolean p1, p0, Lv6/h0$f;->c:Z

    return-object p0
.end method

.method public j(I)Lv6/h0$f;
    .locals 0

    iput p1, p0, Lv6/h0$f;->e:I

    return-object p0
.end method
