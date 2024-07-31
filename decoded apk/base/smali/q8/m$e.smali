.class public final Lq8/m$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field private static final e:Ljava/lang/String;

.field private static final f:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field public static final s:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lq8/m$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:[I

.field public final c:I

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8/m$e;->e:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8/m$e;->f:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq8/m$e;->r:Ljava/lang/String;

    new-instance v0, Lq8/o;

    invoke-direct {v0}, Lq8/o;-><init>()V

    sput-object v0, Lq8/m$e;->s:Lt6/o$a;

    return-void
.end method

.method public varargs constructor <init>(I[I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lq8/m$e;-><init>(I[II)V

    return-void
.end method

.method public constructor <init>(I[II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq8/m$e;->a:I

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Lq8/m$e;->b:[I

    array-length p2, p2

    iput p2, p0, Lq8/m$e;->c:I

    iput p3, p0, Lq8/m$e;->d:I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lq8/m$e;
    .locals 0

    invoke-static {p0}, Lq8/m$e;->d(Landroid/os/Bundle;)Lq8/m$e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Lq8/m$e;
    .locals 4

    sget-object v0, Lq8/m$e;->e:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lq8/m$e;->f:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v2

    sget-object v3, Lq8/m$e;->r:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ltz v0, :cond_0

    if-ltz p0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lt8/a;->a(Z)V

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lq8/m$e;

    invoke-direct {v1, v0, v2, p0}, Lq8/m$e;-><init>(I[II)V

    return-object v1
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lq8/m$e;->e:Ljava/lang/String;

    iget v2, p0, Lq8/m$e;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lq8/m$e;->f:Ljava/lang/String;

    iget-object v2, p0, Lq8/m$e;->b:[I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    sget-object v1, Lq8/m$e;->r:Ljava/lang/String;

    iget v2, p0, Lq8/m$e;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public c(I)Z
    .locals 5

    iget-object v0, p0, Lq8/m$e;->b:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget v4, v0, v3

    if-ne v4, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lq8/m$e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lq8/m$e;

    iget v2, p0, Lq8/m$e;->a:I

    iget v3, p1, Lq8/m$e;->a:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lq8/m$e;->b:[I

    iget-object v3, p1, Lq8/m$e;->b:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget v2, p0, Lq8/m$e;->d:I

    iget p1, p1, Lq8/m$e;->d:I

    if-ne v2, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lq8/m$e;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lq8/m$e;->b:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lq8/m$e;->d:I

    add-int/2addr v0, v1

    return v0
.end method
