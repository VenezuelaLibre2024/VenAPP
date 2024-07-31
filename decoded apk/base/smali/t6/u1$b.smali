.class public final Lt6/u1$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:I

.field private F:I

.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ll7/a;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:I

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field private n:Lx6/m;

.field private o:J

.field private p:I

.field private q:I

.field private r:F

.field private s:I

.field private t:F

.field private u:[B

.field private v:I

.field private w:Lu8/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lt6/u1$b;->f:I

    iput v0, p0, Lt6/u1$b;->g:I

    iput v0, p0, Lt6/u1$b;->l:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lt6/u1$b;->o:J

    iput v0, p0, Lt6/u1$b;->p:I

    iput v0, p0, Lt6/u1$b;->q:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lt6/u1$b;->r:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lt6/u1$b;->t:F

    iput v0, p0, Lt6/u1$b;->v:I

    iput v0, p0, Lt6/u1$b;->x:I

    iput v0, p0, Lt6/u1$b;->y:I

    iput v0, p0, Lt6/u1$b;->z:I

    iput v0, p0, Lt6/u1$b;->C:I

    iput v0, p0, Lt6/u1$b;->D:I

    iput v0, p0, Lt6/u1$b;->E:I

    const/4 v0, 0x0

    iput v0, p0, Lt6/u1$b;->F:I

    return-void
.end method

.method private constructor <init>(Lt6/u1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lt6/u1;->a:Ljava/lang/String;

    iput-object v0, p0, Lt6/u1$b;->a:Ljava/lang/String;

    iget-object v0, p1, Lt6/u1;->b:Ljava/lang/String;

    iput-object v0, p0, Lt6/u1$b;->b:Ljava/lang/String;

    iget-object v0, p1, Lt6/u1;->c:Ljava/lang/String;

    iput-object v0, p0, Lt6/u1$b;->c:Ljava/lang/String;

    iget v0, p1, Lt6/u1;->d:I

    iput v0, p0, Lt6/u1$b;->d:I

    iget v0, p1, Lt6/u1;->e:I

    iput v0, p0, Lt6/u1$b;->e:I

    iget v0, p1, Lt6/u1;->f:I

    iput v0, p0, Lt6/u1$b;->f:I

    iget v0, p1, Lt6/u1;->r:I

    iput v0, p0, Lt6/u1$b;->g:I

    iget-object v0, p1, Lt6/u1;->t:Ljava/lang/String;

    iput-object v0, p0, Lt6/u1$b;->h:Ljava/lang/String;

    iget-object v0, p1, Lt6/u1;->u:Ll7/a;

    iput-object v0, p0, Lt6/u1$b;->i:Ll7/a;

    iget-object v0, p1, Lt6/u1;->v:Ljava/lang/String;

    iput-object v0, p0, Lt6/u1$b;->j:Ljava/lang/String;

    iget-object v0, p1, Lt6/u1;->w:Ljava/lang/String;

    iput-object v0, p0, Lt6/u1$b;->k:Ljava/lang/String;

    iget v0, p1, Lt6/u1;->x:I

    iput v0, p0, Lt6/u1$b;->l:I

    iget-object v0, p1, Lt6/u1;->y:Ljava/util/List;

    iput-object v0, p0, Lt6/u1$b;->m:Ljava/util/List;

    iget-object v0, p1, Lt6/u1;->z:Lx6/m;

    iput-object v0, p0, Lt6/u1$b;->n:Lx6/m;

    iget-wide v0, p1, Lt6/u1;->A:J

    iput-wide v0, p0, Lt6/u1$b;->o:J

    iget v0, p1, Lt6/u1;->B:I

    iput v0, p0, Lt6/u1$b;->p:I

    iget v0, p1, Lt6/u1;->C:I

    iput v0, p0, Lt6/u1$b;->q:I

    iget v0, p1, Lt6/u1;->D:F

    iput v0, p0, Lt6/u1$b;->r:F

    iget v0, p1, Lt6/u1;->E:I

    iput v0, p0, Lt6/u1$b;->s:I

    iget v0, p1, Lt6/u1;->F:F

    iput v0, p0, Lt6/u1$b;->t:F

    iget-object v0, p1, Lt6/u1;->G:[B

    iput-object v0, p0, Lt6/u1$b;->u:[B

    iget v0, p1, Lt6/u1;->H:I

    iput v0, p0, Lt6/u1$b;->v:I

    iget-object v0, p1, Lt6/u1;->I:Lu8/c;

    iput-object v0, p0, Lt6/u1$b;->w:Lu8/c;

    iget v0, p1, Lt6/u1;->J:I

    iput v0, p0, Lt6/u1$b;->x:I

    iget v0, p1, Lt6/u1;->K:I

    iput v0, p0, Lt6/u1$b;->y:I

    iget v0, p1, Lt6/u1;->L:I

    iput v0, p0, Lt6/u1$b;->z:I

    iget v0, p1, Lt6/u1;->M:I

    iput v0, p0, Lt6/u1$b;->A:I

    iget v0, p1, Lt6/u1;->N:I

    iput v0, p0, Lt6/u1$b;->B:I

    iget v0, p1, Lt6/u1;->O:I

    iput v0, p0, Lt6/u1$b;->C:I

    iget v0, p1, Lt6/u1;->P:I

    iput v0, p0, Lt6/u1$b;->D:I

    iget v0, p1, Lt6/u1;->Q:I

    iput v0, p0, Lt6/u1$b;->E:I

    iget p1, p1, Lt6/u1;->R:I

    iput p1, p0, Lt6/u1$b;->F:I

    return-void
.end method

.method synthetic constructor <init>(Lt6/u1;Lt6/u1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/u1$b;-><init>(Lt6/u1;)V

    return-void
.end method

.method static synthetic A(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->d:I

    return p0
.end method

.method static synthetic B(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->e:I

    return p0
.end method

.method static synthetic C(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->f:I

    return p0
.end method

.method static synthetic D(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->g:I

    return p0
.end method

.method static synthetic E(Lt6/u1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic F(Lt6/u1$b;)Ll7/a;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->i:Ll7/a;

    return-object p0
.end method

.method static synthetic a(Lt6/u1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lt6/u1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic c(Lt6/u1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic d(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->l:I

    return p0
.end method

.method static synthetic e(Lt6/u1$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method static synthetic f(Lt6/u1$b;)Lx6/m;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->n:Lx6/m;

    return-object p0
.end method

.method static synthetic g(Lt6/u1$b;)J
    .locals 2

    iget-wide v0, p0, Lt6/u1$b;->o:J

    return-wide v0
.end method

.method static synthetic h(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->p:I

    return p0
.end method

.method static synthetic i(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->q:I

    return p0
.end method

.method static synthetic j(Lt6/u1$b;)F
    .locals 0

    iget p0, p0, Lt6/u1$b;->r:F

    return p0
.end method

.method static synthetic k(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->s:I

    return p0
.end method

.method static synthetic l(Lt6/u1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic m(Lt6/u1$b;)F
    .locals 0

    iget p0, p0, Lt6/u1$b;->t:F

    return p0
.end method

.method static synthetic n(Lt6/u1$b;)[B
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->u:[B

    return-object p0
.end method

.method static synthetic o(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->v:I

    return p0
.end method

.method static synthetic p(Lt6/u1$b;)Lu8/c;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->w:Lu8/c;

    return-object p0
.end method

.method static synthetic q(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->x:I

    return p0
.end method

.method static synthetic r(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->y:I

    return p0
.end method

.method static synthetic s(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->z:I

    return p0
.end method

.method static synthetic t(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->A:I

    return p0
.end method

.method static synthetic u(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->B:I

    return p0
.end method

.method static synthetic v(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->C:I

    return p0
.end method

.method static synthetic w(Lt6/u1$b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lt6/u1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic x(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->D:I

    return p0
.end method

.method static synthetic y(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->E:I

    return p0
.end method

.method static synthetic z(Lt6/u1$b;)I
    .locals 0

    iget p0, p0, Lt6/u1$b;->F:I

    return p0
.end method


# virtual methods
.method public G()Lt6/u1;
    .locals 2

    new-instance v0, Lt6/u1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lt6/u1;-><init>(Lt6/u1$b;Lt6/u1$a;)V

    return-object v0
.end method

.method public H(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->C:I

    return-object p0
.end method

.method public I(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->f:I

    return-object p0
.end method

.method public J(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->x:I

    return-object p0
.end method

.method public K(Ljava/lang/String;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public L(Lu8/c;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->w:Lu8/c;

    return-object p0
.end method

.method public M(Ljava/lang/String;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->j:Ljava/lang/String;

    return-object p0
.end method

.method public N(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->F:I

    return-object p0
.end method

.method public O(Lx6/m;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->n:Lx6/m;

    return-object p0
.end method

.method public P(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->A:I

    return-object p0
.end method

.method public Q(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->B:I

    return-object p0
.end method

.method public R(F)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->r:F

    return-object p0
.end method

.method public S(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->q:I

    return-object p0
.end method

.method public T(I)Lt6/u1$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lt6/u1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public U(Ljava/lang/String;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public V(Ljava/util/List;)Lt6/u1$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;)",
            "Lt6/u1$b;"
        }
    .end annotation

    iput-object p1, p0, Lt6/u1$b;->m:Ljava/util/List;

    return-object p0
.end method

.method public W(Ljava/lang/String;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public X(Ljava/lang/String;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public Y(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->l:I

    return-object p0
.end method

.method public Z(Ll7/a;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->i:Ll7/a;

    return-object p0
.end method

.method public a0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->z:I

    return-object p0
.end method

.method public b0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->g:I

    return-object p0
.end method

.method public c0(F)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->t:F

    return-object p0
.end method

.method public d0([B)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->u:[B

    return-object p0
.end method

.method public e0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->e:I

    return-object p0
.end method

.method public f0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->s:I

    return-object p0
.end method

.method public g0(Ljava/lang/String;)Lt6/u1$b;
    .locals 0

    iput-object p1, p0, Lt6/u1$b;->k:Ljava/lang/String;

    return-object p0
.end method

.method public h0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->y:I

    return-object p0
.end method

.method public i0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->d:I

    return-object p0
.end method

.method public j0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->v:I

    return-object p0
.end method

.method public k0(J)Lt6/u1$b;
    .locals 0

    iput-wide p1, p0, Lt6/u1$b;->o:J

    return-object p0
.end method

.method public l0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->D:I

    return-object p0
.end method

.method public m0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->E:I

    return-object p0
.end method

.method public n0(I)Lt6/u1$b;
    .locals 0

    iput p1, p0, Lt6/u1$b;->p:I

    return-object p0
.end method
