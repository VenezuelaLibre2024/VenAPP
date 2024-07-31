.class public final Lu8/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# static fields
.field public static final e:Lu8/a0;

.field private static final f:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lu8/a0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu8/a0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lu8/a0;-><init>(II)V

    sput-object v0, Lu8/a0;->e:Lu8/a0;

    invoke-static {v1}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu8/a0;->f:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu8/a0;->r:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu8/a0;->s:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lu8/a0;->t:Ljava/lang/String;

    new-instance v0, Lu8/z;

    invoke-direct {v0}, Lu8/z;-><init>()V

    sput-object v0, Lu8/a0;->u:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, p2, v0, v1}, Lu8/a0;-><init>(IIIF)V

    return-void
.end method

.method public constructor <init>(IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu8/a0;->a:I

    iput p2, p0, Lu8/a0;->b:I

    iput p3, p0, Lu8/a0;->c:I

    iput p4, p0, Lu8/a0;->d:F

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lu8/a0;
    .locals 0

    invoke-static {p0}, Lu8/a0;->c(Landroid/os/Bundle;)Lu8/a0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Lu8/a0;
    .locals 5

    sget-object v0, Lu8/a0;->f:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lu8/a0;->r:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget-object v3, Lu8/a0;->s:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    sget-object v3, Lu8/a0;->t:Ljava/lang/String;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {p0, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    new-instance v3, Lu8/a0;

    invoke-direct {v3, v0, v2, v1, p0}, Lu8/a0;-><init>(IIIF)V

    return-object v3
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lu8/a0;->f:Ljava/lang/String;

    iget v2, p0, Lu8/a0;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lu8/a0;->r:Ljava/lang/String;

    iget v2, p0, Lu8/a0;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lu8/a0;->s:Ljava/lang/String;

    iget v2, p0, Lu8/a0;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lu8/a0;->t:Ljava/lang/String;

    iget v2, p0, Lu8/a0;->d:F

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu8/a0;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lu8/a0;

    iget v1, p0, Lu8/a0;->a:I

    iget v3, p1, Lu8/a0;->a:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lu8/a0;->b:I

    iget v3, p1, Lu8/a0;->b:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lu8/a0;->c:I

    iget v3, p1, Lu8/a0;->c:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lu8/a0;->d:F

    iget p1, p1, Lu8/a0;->d:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    const/16 v0, 0xd9

    iget v1, p0, Lu8/a0;->a:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu8/a0;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu8/a0;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lu8/a0;->d:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
