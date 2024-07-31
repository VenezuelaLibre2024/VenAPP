.class final Lt6/d1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/y;
.implements Lv6/u;
.implements Lg8/p;
.implements Ll7/e;
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/TextureView$SurfaceTextureListener;
.implements Lv8/l$b;
.implements Lt6/j$b;
.implements Lt6/b$b;
.implements Lt6/y3$b;
.implements Lt6/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/d1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lt6/d1;


# direct methods
.method private constructor <init>(Lt6/d1;)V
    .locals 0

    iput-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lt6/d1;Lt6/d1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1$c;-><init>(Lt6/d1;)V

    return-void
.end method

.method public static synthetic D(Ll7/a;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1$c;->O(Ll7/a;Lt6/j3$d;)V

    return-void
.end method

.method public static synthetic E(Lu8/a0;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1$c;->S(Lu8/a0;Lt6/j3$d;)V

    return-void
.end method

.method public static synthetic F(IZLt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lt6/d1$c;->R(IZLt6/j3$d;)V

    return-void
.end method

.method public static synthetic G(Lg8/f;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1$c;->M(Lg8/f;Lt6/j3$d;)V

    return-void
.end method

.method public static synthetic H(Ljava/util/List;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1$c;->L(Ljava/util/List;Lt6/j3$d;)V

    return-void
.end method

.method public static synthetic I(Lt6/d1$c;Lt6/j3$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lt6/d1$c;->N(Lt6/j3$d;)V

    return-void
.end method

.method public static synthetic J(Lt6/v;Lt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1$c;->Q(Lt6/v;Lt6/j3$d;)V

    return-void
.end method

.method public static synthetic K(ZLt6/j3$d;)V
    .locals 0

    invoke-static {p0, p1}, Lt6/d1$c;->P(ZLt6/j3$d;)V

    return-void
.end method

.method private static synthetic L(Ljava/util/List;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onCues(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic M(Lg8/f;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onCues(Lg8/f;)V

    return-void
.end method

.method private synthetic N(Lt6/j3$d;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->z0(Lt6/d1;)Lt6/h2;

    move-result-object v0

    invoke-interface {p1, v0}, Lt6/j3$d;->onMediaMetadataChanged(Lt6/h2;)V

    return-void
.end method

.method private static synthetic O(Ll7/a;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onMetadata(Ll7/a;)V

    return-void
.end method

.method private static synthetic P(ZLt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onSkipSilenceEnabledChanged(Z)V

    return-void
.end method

.method private static synthetic Q(Lt6/v;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onDeviceInfoChanged(Lt6/v;)V

    return-void
.end method

.method private static synthetic R(IZLt6/j3$d;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lt6/j3$d;->onDeviceVolumeChanged(IZ)V

    return-void
.end method

.method private static synthetic S(Lu8/a0;Lt6/j3$d;)V
    .locals 0

    invoke-interface {p1, p0}, Lt6/j3$d;->onVideoSizeChanged(Lu8/a0;)V

    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 0

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1}, Lt6/d1;->M0(Lt6/d1;)V

    return-void
.end method

.method public B(F)V
    .locals 0

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1}, Lt6/d1;->F0(Lt6/d1;)V

    return-void
.end method

.method public C(I)V
    .locals 3

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-virtual {v0}, Lt6/d1;->u()Z

    move-result v0

    iget-object v1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->G0(ZI)I

    move-result v2

    invoke-static {v1, v0, p1, v2}, Lt6/d1;->H0(Lt6/d1;ZII)V

    return-void
.end method

.method public a(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public c(Lw6/e;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->c(Lw6/e;)V

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt6/d1;->P0(Lt6/d1;Lt6/u1;)Lt6/u1;

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1, v0}, Lt6/d1;->N0(Lt6/d1;Lw6/e;)Lw6/e;

    return-void
.end method

.method public d(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lu6/a;->d(Ljava/lang/String;JJ)V

    return-void
.end method

.method public e(Lw6/e;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->N0(Lt6/d1;Lw6/e;)Lw6/e;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->e(Lw6/e;)V

    return-void
.end method

.method public f(Lt6/u1;Lw6/i;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->s0(Lt6/d1;Lt6/u1;)Lt6/u1;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lu6/a;->f(Lt6/u1;Lw6/i;)V

    return-void
.end method

.method public g(Lt6/u1;Lw6/i;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->P0(Lt6/d1;Lt6/u1;)Lt6/u1;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lu6/a;->g(Lt6/u1;Lw6/i;)V

    return-void
.end method

.method public h(Lw6/e;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->h(Lw6/e;)V

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt6/d1;->s0(Lt6/d1;Lt6/u1;)Lt6/u1;

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1, v0}, Lt6/d1;->T0(Lt6/d1;Lw6/e;)Lw6/e;

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->i(Ljava/lang/String;)V

    return-void
.end method

.method public j(Ljava/lang/String;JJ)V
    .locals 7

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v1

    move-object v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lu6/a;->j(Ljava/lang/String;JJ)V

    return-void
.end method

.method public k(J)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lu6/a;->k(J)V

    return-void
.end method

.method public l(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public m(Lw6/e;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->T0(Lt6/d1;Lw6/e;)Lw6/e;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->m(Lw6/e;)V

    return-void
.end method

.method public n(IJ)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lu6/a;->n(IJ)V

    return-void
.end method

.method public o(Ljava/lang/Object;J)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lu6/a;->o(Ljava/lang/Object;J)V

    iget-object p2, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p2}, Lt6/d1;->S0(Lt6/d1;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object p1

    new-instance p2, Lt6/l1;

    invoke-direct {p2}, Lt6/l1;-><init>()V

    const/16 p3, 0x1a

    invoke-virtual {p1, p3, p2}, Lt8/r;->l(ILt8/r$a;)V

    :cond_0
    return-void
.end method

.method public onCues(Lg8/f;)V
    .locals 2

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->v0(Lt6/d1;Lg8/f;)Lg8/f;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/k1;

    invoke-direct {v1, p1}, Lt6/k1;-><init>(Lg8/f;)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method

.method public onCues(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/h1;

    invoke-direct {v1, p1}, Lt6/h1;-><init>(Ljava/util/List;)V

    const/16 p1, 0x1b

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method

.method public onMetadata(Ll7/a;)V
    .locals 3

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->w0(Lt6/d1;)Lt6/h2;

    move-result-object v1

    invoke-virtual {v1}, Lt6/h2;->c()Lt6/h2$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lt6/h2$b;->L(Ll7/a;)Lt6/h2$b;

    move-result-object v1

    invoke-virtual {v1}, Lt6/h2$b;->H()Lt6/h2;

    move-result-object v1

    invoke-static {v0, v1}, Lt6/d1;->x0(Lt6/d1;Lt6/h2;)Lt6/h2;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->y0(Lt6/d1;)Lt6/h2;

    move-result-object v0

    iget-object v1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v1}, Lt6/d1;->z0(Lt6/d1;)Lt6/h2;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt6/h2;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v1, v0}, Lt6/d1;->A0(Lt6/d1;Lt6/h2;)Lt6/h2;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/f1;

    invoke-direct {v1, p0}, Lt6/f1;-><init>(Lt6/d1$c;)V

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Lt8/r;->i(ILt8/r$a;)V

    :cond_0
    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/g1;

    invoke-direct {v1, p1}, Lt6/g1;-><init>(Ll7/a;)V

    const/16 p1, 0x1c

    invoke-virtual {v0, p1, v1}, Lt8/r;->i(ILt8/r$a;)V

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object p1

    invoke-virtual {p1}, Lt8/r;->f()V

    return-void
.end method

.method public onSkipSilenceEnabledChanged(Z)V
    .locals 2

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->t0(Lt6/d1;)Z

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->u0(Lt6/d1;Z)Z

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/n1;

    invoke-direct {v1, p1}, Lt6/n1;-><init>(Z)V

    const/16 p1, 0x17

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->E0(Lt6/d1;Landroid/graphics/SurfaceTexture;)V

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1, p2, p3}, Lt6/d1;->D0(Lt6/d1;II)V

    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt6/d1;->C0(Lt6/d1;Ljava/lang/Object;)V

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lt6/d1;->D0(Lt6/d1;II)V

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1, p2, p3}, Lt6/d1;->D0(Lt6/d1;II)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public onVideoSizeChanged(Lu8/a0;)V
    .locals 2

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->Q0(Lt6/d1;Lu8/a0;)Lu8/a0;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/m1;

    invoke-direct {v1, p1}, Lt6/m1;-><init>(Lu8/a0;)V

    const/16 p1, 0x19

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method

.method public p(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lu6/a;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public q(IJJ)V
    .locals 7

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-interface/range {v1 .. v6}, Lu6/a;->q(IJJ)V

    return-void
.end method

.method public r(JI)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->O0(Lt6/d1;)Lu6/a;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lu6/a;->r(JI)V

    return-void
.end method

.method public s(I)V
    .locals 2

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1}, Lt6/d1;->I0(Lt6/d1;)Lt6/y3;

    move-result-object p1

    invoke-static {p1}, Lt6/d1;->J0(Lt6/y3;)Lt6/v;

    move-result-object p1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->K0(Lt6/d1;)Lt6/v;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt6/v;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->L0(Lt6/d1;Lt6/v;)Lt6/v;

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/i1;

    invoke-direct {v1, p1}, Lt6/i1;-><init>(Lt6/v;)V

    const/16 p1, 0x1d

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    :cond_0
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 0

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1, p3, p4}, Lt6/d1;->D0(Lt6/d1;II)V

    return-void
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->B0(Lt6/d1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object p1

    invoke-static {v0, p1}, Lt6/d1;->C0(Lt6/d1;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {p1}, Lt6/d1;->B0(Lt6/d1;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt6/d1;->C0(Lt6/d1;Ljava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lt6/d1;->D0(Lt6/d1;II)V

    return-void
.end method

.method public u()V
    .locals 4

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v1, -0x1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lt6/d1;->H0(Lt6/d1;ZII)V

    return-void
.end method

.method public w(Landroid/view/Surface;)V
    .locals 1

    iget-object p1, p0, Lt6/d1$c;->a:Lt6/d1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lt6/d1;->C0(Lt6/d1;Ljava/lang/Object;)V

    return-void
.end method

.method public x(Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0, p1}, Lt6/d1;->C0(Lt6/d1;Ljava/lang/Object;)V

    return-void
.end method

.method public y(IZ)V
    .locals 2

    iget-object v0, p0, Lt6/d1$c;->a:Lt6/d1;

    invoke-static {v0}, Lt6/d1;->R0(Lt6/d1;)Lt8/r;

    move-result-object v0

    new-instance v1, Lt6/j1;

    invoke-direct {v1, p1, p2}, Lt6/j1;-><init>(IZ)V

    const/16 p1, 0x1e

    invoke-virtual {v0, p1, v1}, Lt8/r;->l(ILt8/r$a;)V

    return-void
.end method
