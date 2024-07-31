.class public final Lt6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# static fields
.field public static final d:Lt6/v;

.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field public static final s:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/v;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt6/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lt6/v;-><init>(III)V

    sput-object v0, Lt6/v;->d:Lt6/v;

    invoke-static {v1}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/v;->e:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/v;->f:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/v;->r:Ljava/lang/String;

    new-instance v0, Lt6/u;

    invoke-direct {v0}, Lt6/u;-><init>()V

    sput-object v0, Lt6/v;->s:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt6/v;->a:I

    iput p2, p0, Lt6/v;->b:I

    iput p3, p0, Lt6/v;->c:I

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/v;
    .locals 0

    invoke-static {p0}, Lt6/v;->c(Landroid/os/Bundle;)Lt6/v;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Lt6/v;
    .locals 4

    sget-object v0, Lt6/v;->e:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lt6/v;->f:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget-object v3, Lt6/v;->r:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    new-instance v1, Lt6/v;

    invoke-direct {v1, v0, v2, p0}, Lt6/v;-><init>(III)V

    return-object v1
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/v;->e:Ljava/lang/String;

    iget v2, p0, Lt6/v;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lt6/v;->f:Ljava/lang/String;

    iget v2, p0, Lt6/v;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lt6/v;->r:Ljava/lang/String;

    iget v2, p0, Lt6/v;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lt6/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lt6/v;

    iget v1, p0, Lt6/v;->a:I

    iget v3, p1, Lt6/v;->a:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lt6/v;->b:I

    iget v3, p1, Lt6/v;->b:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Lt6/v;->c:I

    iget p1, p1, Lt6/v;->c:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    const/16 v0, 0x20f

    iget v1, p0, Lt6/v;->a:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lt6/v;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lt6/v;->c:I

    add-int/2addr v0, v1

    return v0
.end method
