.class public final Lt6/i4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/i4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final f:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lt6/i4$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field private final b:Lv7/d1;

.field private final c:Z

.field private final d:[I

.field private final e:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/i4$a;->f:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/i4$a;->r:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/i4$a;->s:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lt6/i4$a;->t:Ljava/lang/String;

    new-instance v0, Lt6/h4;

    invoke-direct {v0}, Lt6/h4;-><init>()V

    sput-object v0, Lt6/i4$a;->u:Lt6/o$a;

    return-void
.end method

.method public constructor <init>(Lv7/d1;Z[I[Z)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lv7/d1;->a:I

    iput v0, p0, Lt6/i4$a;->a:I

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    array-length v1, p4

    if-ne v0, v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lt8/a;->a(Z)V

    iput-object p1, p0, Lt6/i4$a;->b:Lv7/d1;

    if-eqz p2, :cond_1

    if-le v0, v3, :cond_1

    move v2, v3

    :cond_1
    iput-boolean v2, p0, Lt6/i4$a;->c:Z

    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Lt6/i4$a;->d:[I

    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    iput-object p1, p0, Lt6/i4$a;->e:[Z

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lt6/i4$a;
    .locals 0

    invoke-static {p0}, Lt6/i4$a;->g(Landroid/os/Bundle;)Lt6/i4$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic g(Landroid/os/Bundle;)Lt6/i4$a;
    .locals 5

    sget-object v0, Lv7/d1;->s:Lt6/o$a;

    sget-object v1, Lt6/i4$a;->f:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    invoke-interface {v0, v1}, Lt6/o$a;->a(Landroid/os/Bundle;)Lt6/o;

    move-result-object v0

    check-cast v0, Lv7/d1;

    sget-object v1, Lt6/i4$a;->r:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    iget v2, v0, Lv7/d1;->a:I

    new-array v2, v2, [I

    invoke-static {v1, v2}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    sget-object v2, Lt6/i4$a;->s:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getBooleanArray(Ljava/lang/String;)[Z

    move-result-object v2

    iget v3, v0, Lv7/d1;->a:I

    new-array v3, v3, [Z

    invoke-static {v2, v3}, Leb/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Z

    sget-object v3, Lt6/i4$a;->t:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    new-instance v3, Lt6/i4$a;

    invoke-direct {v3, v0, p0, v1, v2}, Lt6/i4$a;-><init>(Lv7/d1;Z[I[Z)V

    return-object v3
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lt6/i4$a;->f:Ljava/lang/String;

    iget-object v2, p0, Lt6/i4$a;->b:Lv7/d1;

    invoke-virtual {v2}, Lv7/d1;->a()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    sget-object v1, Lt6/i4$a;->r:Ljava/lang/String;

    iget-object v2, p0, Lt6/i4$a;->d:[I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    sget-object v1, Lt6/i4$a;->s:Ljava/lang/String;

    iget-object v2, p0, Lt6/i4$a;->e:[Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    sget-object v1, Lt6/i4$a;->t:Ljava/lang/String;

    iget-boolean v2, p0, Lt6/i4$a;->c:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public c(I)Lt6/u1;
    .locals 1

    iget-object v0, p0, Lt6/i4$a;->b:Lv7/d1;

    invoke-virtual {v0, p1}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object p1

    return-object p1
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lt6/i4$a;->b:Lv7/d1;

    iget v0, v0, Lv7/d1;->c:I

    return v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lt6/i4$a;->e:[Z

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lhb/a;->b([ZZ)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lt6/i4$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lt6/i4$a;

    iget-boolean v2, p0, Lt6/i4$a;->c:Z

    iget-boolean v3, p1, Lt6/i4$a;->c:Z

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lt6/i4$a;->b:Lv7/d1;

    iget-object v3, p1, Lt6/i4$a;->b:Lv7/d1;

    invoke-virtual {v2, v3}, Lv7/d1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/i4$a;->d:[I

    iget-object v3, p1, Lt6/i4$a;->d:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lt6/i4$a;->e:[Z

    iget-object p1, p1, Lt6/i4$a;->e:[Z

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public f(I)Z
    .locals 1

    iget-object v0, p0, Lt6/i4$a;->e:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lt6/i4$a;->b:Lv7/d1;

    invoke-virtual {v0}, Lv7/d1;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lt6/i4$a;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/i4$a;->d:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lt6/i4$a;->e:[Z

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
