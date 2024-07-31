.class public final Lg8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:Landroid/graphics/Bitmap;

.field private c:Landroid/text/Layout$Alignment;

.field private d:Landroid/text/Layout$Alignment;

.field private e:F

.field private f:I

.field private g:I

.field private h:F

.field private i:I

.field private j:I

.field private k:F

.field private l:F

.field private m:F

.field private n:Z

.field private o:I

.field private p:I

.field private q:F


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg8/b$b;->a:Ljava/lang/CharSequence;

    iput-object v0, p0, Lg8/b$b;->b:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lg8/b$b;->c:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lg8/b$b;->d:Landroid/text/Layout$Alignment;

    const v0, -0x800001

    iput v0, p0, Lg8/b$b;->e:F

    const/high16 v1, -0x80000000

    iput v1, p0, Lg8/b$b;->f:I

    iput v1, p0, Lg8/b$b;->g:I

    iput v0, p0, Lg8/b$b;->h:F

    iput v1, p0, Lg8/b$b;->i:I

    iput v1, p0, Lg8/b$b;->j:I

    iput v0, p0, Lg8/b$b;->k:F

    iput v0, p0, Lg8/b$b;->l:F

    iput v0, p0, Lg8/b$b;->m:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg8/b$b;->n:Z

    const/high16 v0, -0x1000000

    iput v0, p0, Lg8/b$b;->o:I

    iput v1, p0, Lg8/b$b;->p:I

    return-void
.end method

.method private constructor <init>(Lg8/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lg8/b;->a:Ljava/lang/CharSequence;

    iput-object v0, p0, Lg8/b$b;->a:Ljava/lang/CharSequence;

    iget-object v0, p1, Lg8/b;->d:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lg8/b$b;->b:Landroid/graphics/Bitmap;

    iget-object v0, p1, Lg8/b;->b:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lg8/b$b;->c:Landroid/text/Layout$Alignment;

    iget-object v0, p1, Lg8/b;->c:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lg8/b$b;->d:Landroid/text/Layout$Alignment;

    iget v0, p1, Lg8/b;->e:F

    iput v0, p0, Lg8/b$b;->e:F

    iget v0, p1, Lg8/b;->f:I

    iput v0, p0, Lg8/b$b;->f:I

    iget v0, p1, Lg8/b;->r:I

    iput v0, p0, Lg8/b$b;->g:I

    iget v0, p1, Lg8/b;->s:F

    iput v0, p0, Lg8/b$b;->h:F

    iget v0, p1, Lg8/b;->t:I

    iput v0, p0, Lg8/b$b;->i:I

    iget v0, p1, Lg8/b;->y:I

    iput v0, p0, Lg8/b$b;->j:I

    iget v0, p1, Lg8/b;->z:F

    iput v0, p0, Lg8/b$b;->k:F

    iget v0, p1, Lg8/b;->u:F

    iput v0, p0, Lg8/b$b;->l:F

    iget v0, p1, Lg8/b;->v:F

    iput v0, p0, Lg8/b$b;->m:F

    iget-boolean v0, p1, Lg8/b;->w:Z

    iput-boolean v0, p0, Lg8/b$b;->n:Z

    iget v0, p1, Lg8/b;->x:I

    iput v0, p0, Lg8/b$b;->o:I

    iget v0, p1, Lg8/b;->A:I

    iput v0, p0, Lg8/b$b;->p:I

    iget p1, p1, Lg8/b;->B:F

    iput p1, p0, Lg8/b$b;->q:F

    return-void
.end method

.method synthetic constructor <init>(Lg8/b;Lg8/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg8/b$b;-><init>(Lg8/b;)V

    return-void
.end method


# virtual methods
.method public a()Lg8/b;
    .locals 22

    move-object/from16 v0, p0

    new-instance v20, Lg8/b;

    move-object/from16 v1, v20

    iget-object v2, v0, Lg8/b$b;->a:Ljava/lang/CharSequence;

    iget-object v3, v0, Lg8/b$b;->c:Landroid/text/Layout$Alignment;

    iget-object v4, v0, Lg8/b$b;->d:Landroid/text/Layout$Alignment;

    iget-object v5, v0, Lg8/b$b;->b:Landroid/graphics/Bitmap;

    iget v6, v0, Lg8/b$b;->e:F

    iget v7, v0, Lg8/b$b;->f:I

    iget v8, v0, Lg8/b$b;->g:I

    iget v9, v0, Lg8/b$b;->h:F

    iget v10, v0, Lg8/b$b;->i:I

    iget v11, v0, Lg8/b$b;->j:I

    iget v12, v0, Lg8/b$b;->k:F

    iget v13, v0, Lg8/b$b;->l:F

    iget v14, v0, Lg8/b$b;->m:F

    iget-boolean v15, v0, Lg8/b$b;->n:Z

    move-object/from16 v21, v1

    iget v1, v0, Lg8/b$b;->o:I

    move/from16 v16, v1

    iget v1, v0, Lg8/b$b;->p:I

    move/from16 v17, v1

    iget v1, v0, Lg8/b$b;->q:F

    move/from16 v18, v1

    const/16 v19, 0x0

    move-object/from16 v1, v21

    invoke-direct/range {v1 .. v19}, Lg8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLg8/b$a;)V

    return-object v20
.end method

.method public b()Lg8/b$b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg8/b$b;->n:Z

    return-object p0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lg8/b$b;->g:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lg8/b$b;->i:I

    return v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lg8/b$b;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public f(Landroid/graphics/Bitmap;)Lg8/b$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public g(F)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->m:F

    return-object p0
.end method

.method public h(FI)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->e:F

    iput p2, p0, Lg8/b$b;->f:I

    return-object p0
.end method

.method public i(I)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->g:I

    return-object p0
.end method

.method public j(Landroid/text/Layout$Alignment;)Lg8/b$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->d:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public k(F)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->h:F

    return-object p0
.end method

.method public l(I)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->i:I

    return-object p0
.end method

.method public m(F)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->q:F

    return-object p0
.end method

.method public n(F)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->l:F

    return-object p0
.end method

.method public o(Ljava/lang/CharSequence;)Lg8/b$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public p(Landroid/text/Layout$Alignment;)Lg8/b$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->c:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public q(FI)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->k:F

    iput p2, p0, Lg8/b$b;->j:I

    return-object p0
.end method

.method public r(I)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->p:I

    return-object p0
.end method

.method public s(I)Lg8/b$b;
    .locals 0

    iput p1, p0, Lg8/b$b;->o:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg8/b$b;->n:Z

    return-object p0
.end method
