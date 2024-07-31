.class public Lud/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lud/l$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/Float;

.field private b:Ljava/lang/Float;

.field private c:Ljava/lang/Float;

.field private d:Ljava/lang/Float;

.field private e:Ljava/lang/Integer;

.field private f:Ljava/lang/Integer;

.field private g:Ljava/lang/Integer;

.field private h:Ljava/lang/Integer;

.field private i:Ljava/lang/Integer;

.field private j:Ljava/lang/Integer;

.field private k:Ljava/lang/Boolean;

.field private l:Ljava/lang/Boolean;

.field private m:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lud/l;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    iput-object p1, p0, Lud/l;->a:Ljava/lang/Float;

    return-object p1
.end method

.method static synthetic b(Lud/l;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lud/l;->k:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic c(Lud/l;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    iput-object p1, p0, Lud/l;->b:Ljava/lang/Float;

    return-object p1
.end method

.method static synthetic d(Lud/l;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lud/l;->l:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic e(Lud/l;Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    iput-object p1, p0, Lud/l;->m:Ljava/lang/Boolean;

    return-object p1
.end method

.method static synthetic f(Lud/l;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    iput-object p1, p0, Lud/l;->c:Ljava/lang/Float;

    return-object p1
.end method

.method static synthetic g(Lud/l;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    iput-object p1, p0, Lud/l;->d:Ljava/lang/Float;

    return-object p1
.end method

.method static synthetic h(Lud/l;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lud/l;->e:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic i(Lud/l;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lud/l;->f:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic j(Lud/l;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lud/l;->h:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic k(Lud/l;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lud/l;->g:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic l(Lud/l;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lud/l;->i:Ljava/lang/Integer;

    return-object p1
.end method

.method static synthetic m(Lud/l;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    iput-object p1, p0, Lud/l;->j:Ljava/lang/Integer;

    return-object p1
.end method

.method public static q()Lud/l$a;
    .locals 1

    new-instance v0, Lud/l$a;

    invoke-direct {v0}, Lud/l$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lud/l;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public n()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lud/l;->l:Ljava/lang/Boolean;

    return-object v0
.end method

.method public o()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lud/l;->m:Ljava/lang/Boolean;

    return-object v0
.end method

.method public p()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lud/l;->k:Ljava/lang/Boolean;

    return-object v0
.end method

.method public r()I
    .locals 2

    invoke-virtual {p0}, Lud/l;->v()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0}, Lud/l;->t()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public s()I
    .locals 2

    invoke-virtual {p0}, Lud/l;->w()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p0}, Lud/l;->u()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public t()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lud/l;->e:Ljava/lang/Integer;

    return-object v0
.end method

.method public u()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lud/l;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public v()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lud/l;->a:Ljava/lang/Float;

    return-object v0
.end method

.method public w()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lud/l;->b:Ljava/lang/Float;

    return-object v0
.end method

.method public x()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lud/l;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public y()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lud/l;->g:Ljava/lang/Integer;

    return-object v0
.end method

.method public z()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lud/l;->j:Ljava/lang/Integer;

    return-object v0
.end method
