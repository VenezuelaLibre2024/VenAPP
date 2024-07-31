.class public final Lbj/d;
.super Lbj/a;
.source "SourceFile"


# static fields
.field static final l:Lvi/p0$i;


# instance fields
.field private final c:Lvi/p0;

.field private final d:Lvi/p0$d;

.field private e:Lvi/p0$c;

.field private f:Lvi/p0;

.field private g:Lvi/p0$c;

.field private h:Lvi/p0;

.field private i:Lvi/p;

.field private j:Lvi/p0$i;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbj/d$c;

    invoke-direct {v0}, Lbj/d$c;-><init>()V

    sput-object v0, Lbj/d;->l:Lvi/p0$i;

    return-void
.end method

.method public constructor <init>(Lvi/p0$d;)V
    .locals 1

    invoke-direct {p0}, Lbj/a;-><init>()V

    new-instance v0, Lbj/d$a;

    invoke-direct {v0, p0}, Lbj/d$a;-><init>(Lbj/d;)V

    iput-object v0, p0, Lbj/d;->c:Lvi/p0;

    iput-object v0, p0, Lbj/d;->f:Lvi/p0;

    iput-object v0, p0, Lbj/d;->h:Lvi/p0;

    const-string v0, "helper"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/p0$d;

    iput-object p1, p0, Lbj/d;->d:Lvi/p0$d;

    return-void
.end method

.method static synthetic g(Lbj/d;)Lvi/p0$d;
    .locals 0

    iget-object p0, p0, Lbj/d;->d:Lvi/p0$d;

    return-object p0
.end method

.method static synthetic h(Lbj/d;)Lvi/p0;
    .locals 0

    iget-object p0, p0, Lbj/d;->h:Lvi/p0;

    return-object p0
.end method

.method static synthetic i(Lbj/d;)Z
    .locals 0

    iget-boolean p0, p0, Lbj/d;->k:Z

    return p0
.end method

.method static synthetic j(Lbj/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Lbj/d;->k:Z

    return p1
.end method

.method static synthetic k(Lbj/d;Lvi/p;)Lvi/p;
    .locals 0

    iput-object p1, p0, Lbj/d;->i:Lvi/p;

    return-object p1
.end method

.method static synthetic l(Lbj/d;Lvi/p0$i;)Lvi/p0$i;
    .locals 0

    iput-object p1, p0, Lbj/d;->j:Lvi/p0$i;

    return-object p1
.end method

.method static synthetic m(Lbj/d;)V
    .locals 0

    invoke-direct {p0}, Lbj/d;->p()V

    return-void
.end method

.method static synthetic n(Lbj/d;)Lvi/p0;
    .locals 0

    iget-object p0, p0, Lbj/d;->f:Lvi/p0;

    return-object p0
.end method

.method static synthetic o(Lbj/d;)Lvi/p0;
    .locals 0

    iget-object p0, p0, Lbj/d;->c:Lvi/p0;

    return-object p0
.end method

.method private p()V
    .locals 3

    iget-object v0, p0, Lbj/d;->d:Lvi/p0$d;

    iget-object v1, p0, Lbj/d;->i:Lvi/p;

    iget-object v2, p0, Lbj/d;->j:Lvi/p0$i;

    invoke-virtual {v0, v1, v2}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    iget-object v0, p0, Lbj/d;->f:Lvi/p0;

    invoke-virtual {v0}, Lvi/p0;->e()V

    iget-object v0, p0, Lbj/d;->h:Lvi/p0;

    iput-object v0, p0, Lbj/d;->f:Lvi/p0;

    iget-object v0, p0, Lbj/d;->g:Lvi/p0$c;

    iput-object v0, p0, Lbj/d;->e:Lvi/p0$c;

    iget-object v0, p0, Lbj/d;->c:Lvi/p0;

    iput-object v0, p0, Lbj/d;->h:Lvi/p0;

    const/4 v0, 0x0

    iput-object v0, p0, Lbj/d;->g:Lvi/p0$c;

    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    iget-object v0, p0, Lbj/d;->h:Lvi/p0;

    invoke-virtual {v0}, Lvi/p0;->e()V

    iget-object v0, p0, Lbj/d;->f:Lvi/p0;

    invoke-virtual {v0}, Lvi/p0;->e()V

    return-void
.end method

.method protected f()Lvi/p0;
    .locals 2

    iget-object v0, p0, Lbj/d;->h:Lvi/p0;

    iget-object v1, p0, Lbj/d;->c:Lvi/p0;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lbj/d;->f:Lvi/p0;

    :cond_0
    return-object v0
.end method

.method public q(Lvi/p0$c;)V
    .locals 2

    const-string v0, "newBalancerFactory"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbj/d;->g:Lvi/p0$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lbj/d;->h:Lvi/p0;

    invoke-virtual {v0}, Lvi/p0;->e()V

    iget-object v0, p0, Lbj/d;->c:Lvi/p0;

    iput-object v0, p0, Lbj/d;->h:Lvi/p0;

    const/4 v0, 0x0

    iput-object v0, p0, Lbj/d;->g:Lvi/p0$c;

    sget-object v0, Lvi/p;->CONNECTING:Lvi/p;

    iput-object v0, p0, Lbj/d;->i:Lvi/p;

    sget-object v0, Lbj/d;->l:Lvi/p0$i;

    iput-object v0, p0, Lbj/d;->j:Lvi/p0$i;

    iget-object v0, p0, Lbj/d;->e:Lvi/p0$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Lbj/d$b;

    invoke-direct {v0, p0}, Lbj/d$b;-><init>(Lbj/d;)V

    invoke-virtual {p1, v0}, Lvi/p0$c;->a(Lvi/p0$d;)Lvi/p0;

    move-result-object v1

    iput-object v1, v0, Lbj/d$b;->a:Lvi/p0;

    iput-object v1, p0, Lbj/d;->h:Lvi/p0;

    iput-object p1, p0, Lbj/d;->g:Lvi/p0$c;

    iget-boolean p1, p0, Lbj/d;->k:Z

    if-nez p1, :cond_2

    invoke-direct {p0}, Lbj/d;->p()V

    :cond_2
    return-void
.end method
