.class public final Lg8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/b$b;
    }
.end annotation


# static fields
.field public static final C:Lg8/b;

.field private static final D:Ljava/lang/String;

.field private static final E:Ljava/lang/String;

.field private static final F:Ljava/lang/String;

.field private static final G:Ljava/lang/String;

.field private static final H:Ljava/lang/String;

.field private static final I:Ljava/lang/String;

.field private static final J:Ljava/lang/String;

.field private static final K:Ljava/lang/String;

.field private static final L:Ljava/lang/String;

.field private static final M:Ljava/lang/String;

.field private static final N:Ljava/lang/String;

.field private static final O:Ljava/lang/String;

.field private static final P:Ljava/lang/String;

.field private static final Q:Ljava/lang/String;

.field private static final R:Ljava/lang/String;

.field private static final S:Ljava/lang/String;

.field private static final T:Ljava/lang/String;

.field public static final U:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lg8/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:I

.field public final B:F

.field public final a:Ljava/lang/CharSequence;

.field public final b:Landroid/text/Layout$Alignment;

.field public final c:Landroid/text/Layout$Alignment;

.field public final d:Landroid/graphics/Bitmap;

.field public final e:F

.field public final f:I

.field public final r:I

.field public final s:F

.field public final t:I

.field public final u:F

.field public final v:F

.field public final w:Z

.field public final x:I

.field public final y:I

.field public final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg8/b$b;

    invoke-direct {v0}, Lg8/b$b;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Lg8/b$b;->o(Ljava/lang/CharSequence;)Lg8/b$b;

    move-result-object v0

    invoke-virtual {v0}, Lg8/b$b;->a()Lg8/b;

    move-result-object v0

    sput-object v0, Lg8/b;->C:Lg8/b;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->D:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->E:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->F:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->G:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->H:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->I:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->J:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->K:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->L:Ljava/lang/String;

    const/16 v0, 0x9

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->M:Ljava/lang/String;

    const/16 v0, 0xa

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->N:Ljava/lang/String;

    const/16 v0, 0xb

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->O:Ljava/lang/String;

    const/16 v0, 0xc

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->P:Ljava/lang/String;

    const/16 v0, 0xd

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->Q:Ljava/lang/String;

    const/16 v0, 0xe

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->R:Ljava/lang/String;

    const/16 v0, 0xf

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->S:Ljava/lang/String;

    const/16 v0, 0x10

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg8/b;->T:Ljava/lang/String;

    new-instance v0, Lg8/a;

    invoke-direct {v0}, Lg8/a;-><init>()V

    sput-object v0, Lg8/b;->U:Lt6/o$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez v1, :cond_0

    invoke-static {p4}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Lt8/a;->a(Z)V

    :goto_1
    instance-of v3, v1, Landroid/text/Spanned;

    if-eqz v3, :cond_2

    invoke-static {p1}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    move-result-object v1

    :goto_2
    iput-object v1, v0, Lg8/b;->a:Ljava/lang/CharSequence;

    move-object v1, p2

    goto :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_2

    :goto_3
    iput-object v1, v0, Lg8/b;->b:Landroid/text/Layout$Alignment;

    move-object v1, p3

    iput-object v1, v0, Lg8/b;->c:Landroid/text/Layout$Alignment;

    iput-object v2, v0, Lg8/b;->d:Landroid/graphics/Bitmap;

    move v1, p5

    iput v1, v0, Lg8/b;->e:F

    move v1, p6

    iput v1, v0, Lg8/b;->f:I

    move v1, p7

    iput v1, v0, Lg8/b;->r:I

    move v1, p8

    iput v1, v0, Lg8/b;->s:F

    move v1, p9

    iput v1, v0, Lg8/b;->t:I

    move/from16 v1, p12

    iput v1, v0, Lg8/b;->u:F

    move/from16 v1, p13

    iput v1, v0, Lg8/b;->v:F

    move/from16 v1, p14

    iput-boolean v1, v0, Lg8/b;->w:Z

    move/from16 v1, p15

    iput v1, v0, Lg8/b;->x:I

    move v1, p10

    iput v1, v0, Lg8/b;->y:I

    move v1, p11

    iput v1, v0, Lg8/b;->z:F

    move/from16 v1, p16

    iput v1, v0, Lg8/b;->A:I

    move/from16 v1, p17

    iput v1, v0, Lg8/b;->B:F

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLg8/b$a;)V
    .locals 0

    invoke-direct/range {p0 .. p17}, Lg8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lg8/b;
    .locals 0

    invoke-static {p0}, Lg8/b;->d(Landroid/os/Bundle;)Lg8/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroid/os/Bundle;)Lg8/b;
    .locals 4

    new-instance v0, Lg8/b$b;

    invoke-direct {v0}, Lg8/b$b;-><init>()V

    sget-object v1, Lg8/b;->D:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lg8/b$b;->o(Ljava/lang/CharSequence;)Lg8/b$b;

    :cond_0
    sget-object v1, Lg8/b;->E:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Landroid/text/Layout$Alignment;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lg8/b$b;->p(Landroid/text/Layout$Alignment;)Lg8/b$b;

    :cond_1
    sget-object v1, Lg8/b;->F:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Landroid/text/Layout$Alignment;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Lg8/b$b;->j(Landroid/text/Layout$Alignment;)Lg8/b$b;

    :cond_2
    sget-object v1, Lg8/b;->G:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lg8/b$b;->f(Landroid/graphics/Bitmap;)Lg8/b$b;

    :cond_3
    sget-object v1, Lg8/b;->H:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lg8/b;->I:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lg8/b$b;->h(FI)Lg8/b$b;

    :cond_4
    sget-object v1, Lg8/b;->J:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->i(I)Lg8/b$b;

    :cond_5
    sget-object v1, Lg8/b;->K:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->k(F)Lg8/b$b;

    :cond_6
    sget-object v1, Lg8/b;->L:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->l(I)Lg8/b$b;

    :cond_7
    sget-object v1, Lg8/b;->N:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Lg8/b;->M:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lg8/b$b;->q(FI)Lg8/b$b;

    :cond_8
    sget-object v1, Lg8/b;->O:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->n(F)Lg8/b$b;

    :cond_9
    sget-object v1, Lg8/b;->P:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->g(F)Lg8/b$b;

    :cond_a
    sget-object v1, Lg8/b;->Q:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->s(I)Lg8/b$b;

    :cond_b
    sget-object v1, Lg8/b;->R:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {v0}, Lg8/b$b;->b()Lg8/b$b;

    :cond_c
    sget-object v1, Lg8/b;->S:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lg8/b$b;->r(I)Lg8/b$b;

    :cond_d
    sget-object v1, Lg8/b;->T:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result p0

    invoke-virtual {v0, p0}, Lg8/b$b;->m(F)Lg8/b$b;

    :cond_e
    invoke-virtual {v0}, Lg8/b$b;->a()Lg8/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lg8/b;->D:Ljava/lang/String;

    iget-object v2, p0, Lg8/b;->a:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    sget-object v1, Lg8/b;->E:Ljava/lang/String;

    iget-object v2, p0, Lg8/b;->b:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    sget-object v1, Lg8/b;->F:Ljava/lang/String;

    iget-object v2, p0, Lg8/b;->c:Landroid/text/Layout$Alignment;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    sget-object v1, Lg8/b;->G:Ljava/lang/String;

    iget-object v2, p0, Lg8/b;->d:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    sget-object v1, Lg8/b;->H:Ljava/lang/String;

    iget v2, p0, Lg8/b;->e:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v1, Lg8/b;->I:Ljava/lang/String;

    iget v2, p0, Lg8/b;->f:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lg8/b;->J:Ljava/lang/String;

    iget v2, p0, Lg8/b;->r:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lg8/b;->K:Ljava/lang/String;

    iget v2, p0, Lg8/b;->s:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v1, Lg8/b;->L:Ljava/lang/String;

    iget v2, p0, Lg8/b;->t:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lg8/b;->M:Ljava/lang/String;

    iget v2, p0, Lg8/b;->y:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lg8/b;->N:Ljava/lang/String;

    iget v2, p0, Lg8/b;->z:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v1, Lg8/b;->O:Ljava/lang/String;

    iget v2, p0, Lg8/b;->u:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v1, Lg8/b;->P:Ljava/lang/String;

    iget v2, p0, Lg8/b;->v:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v1, Lg8/b;->R:Ljava/lang/String;

    iget-boolean v2, p0, Lg8/b;->w:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sget-object v1, Lg8/b;->Q:Ljava/lang/String;

    iget v2, p0, Lg8/b;->x:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lg8/b;->S:Ljava/lang/String;

    iget v2, p0, Lg8/b;->A:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lg8/b;->T:Ljava/lang/String;

    iget v2, p0, Lg8/b;->B:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v0
.end method

.method public c()Lg8/b$b;
    .locals 2

    new-instance v0, Lg8/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg8/b$b;-><init>(Lg8/b;Lg8/b$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    const-class v2, Lg8/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p1, Lg8/b;

    iget-object v2, p0, Lg8/b;->a:Ljava/lang/CharSequence;

    iget-object v3, p1, Lg8/b;->a:Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lg8/b;->b:Landroid/text/Layout$Alignment;

    iget-object v3, p1, Lg8/b;->b:Landroid/text/Layout$Alignment;

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lg8/b;->c:Landroid/text/Layout$Alignment;

    iget-object v3, p1, Lg8/b;->c:Landroid/text/Layout$Alignment;

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lg8/b;->d:Landroid/graphics/Bitmap;

    if-nez v2, :cond_2

    iget-object v2, p1, Lg8/b;->d:Landroid/graphics/Bitmap;

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v3, p1, Lg8/b;->d:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_3

    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->sameAs(Landroid/graphics/Bitmap;)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_0
    iget v2, p0, Lg8/b;->e:F

    iget v3, p1, Lg8/b;->e:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lg8/b;->f:I

    iget v3, p1, Lg8/b;->f:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->r:I

    iget v3, p1, Lg8/b;->r:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->s:F

    iget v3, p1, Lg8/b;->s:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lg8/b;->t:I

    iget v3, p1, Lg8/b;->t:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->u:F

    iget v3, p1, Lg8/b;->u:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lg8/b;->v:F

    iget v3, p1, Lg8/b;->v:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lg8/b;->w:Z

    iget-boolean v3, p1, Lg8/b;->w:Z

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->x:I

    iget v3, p1, Lg8/b;->x:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->y:I

    iget v3, p1, Lg8/b;->y:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->z:F

    iget v3, p1, Lg8/b;->z:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_3

    iget v2, p0, Lg8/b;->A:I

    iget v3, p1, Lg8/b;->A:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Lg8/b;->B:F

    iget p1, p1, Lg8/b;->B:F

    cmpl-float p1, v2, p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    return v0

    :cond_4
    :goto_2
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lg8/b;->a:Ljava/lang/CharSequence;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lg8/b;->b:Landroid/text/Layout$Alignment;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lg8/b;->c:Landroid/text/Layout$Alignment;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lg8/b;->d:Landroid/graphics/Bitmap;

    aput-object v2, v0, v1

    iget v1, p0, Lg8/b;->e:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->s:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->u:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->v:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    iget-boolean v1, p0, Lg8/b;->w:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->z:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->A:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0xf

    aput-object v1, v0, v2

    iget v1, p0, Lg8/b;->B:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
