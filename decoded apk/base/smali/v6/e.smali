.class public final Lv6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/e$c;,
        Lv6/e$b;,
        Lv6/e$e;,
        Lv6/e$d;
    }
.end annotation


# static fields
.field public static final r:Lv6/e;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field private static final u:Ljava/lang/String;

.field private static final v:Ljava/lang/String;

.field private static final w:Ljava/lang/String;

.field public static final x:Lt6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt6/o$a<",
            "Lv6/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field private f:Lv6/e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv6/e$e;

    invoke-direct {v0}, Lv6/e$e;-><init>()V

    invoke-virtual {v0}, Lv6/e$e;->a()Lv6/e;

    move-result-object v0

    sput-object v0, Lv6/e;->r:Lv6/e;

    const/4 v0, 0x0

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv6/e;->s:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv6/e;->t:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv6/e;->u:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv6/e;->v:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lt8/r0;->r0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lv6/e;->w:Ljava/lang/String;

    new-instance v0, Lv6/d;

    invoke-direct {v0}, Lv6/d;-><init>()V

    sput-object v0, Lv6/e;->x:Lt6/o$a;

    return-void
.end method

.method private constructor <init>(IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lv6/e;->a:I

    iput p2, p0, Lv6/e;->b:I

    iput p3, p0, Lv6/e;->c:I

    iput p4, p0, Lv6/e;->d:I

    iput p5, p0, Lv6/e;->e:I

    return-void
.end method

.method synthetic constructor <init>(IIIIILv6/e$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lv6/e;-><init>(IIIII)V

    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Lv6/e;
    .locals 0

    invoke-static {p0}, Lv6/e;->d(Landroid/os/Bundle;)Lv6/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Lv6/e;
    .locals 3

    new-instance v0, Lv6/e$e;

    invoke-direct {v0}, Lv6/e$e;-><init>()V

    sget-object v1, Lv6/e;->s:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lv6/e$e;->c(I)Lv6/e$e;

    :cond_0
    sget-object v1, Lv6/e;->t:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lv6/e$e;->d(I)Lv6/e$e;

    :cond_1
    sget-object v1, Lv6/e;->u:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lv6/e$e;->f(I)Lv6/e$e;

    :cond_2
    sget-object v1, Lv6/e;->v:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lv6/e$e;->b(I)Lv6/e$e;

    :cond_3
    sget-object v1, Lv6/e;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-virtual {v0, p0}, Lv6/e$e;->e(I)Lv6/e$e;

    :cond_4
    invoke-virtual {v0}, Lv6/e$e;->a()Lv6/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lv6/e;->s:Ljava/lang/String;

    iget v2, p0, Lv6/e;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lv6/e;->t:Ljava/lang/String;

    iget v2, p0, Lv6/e;->b:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lv6/e;->u:Ljava/lang/String;

    iget v2, p0, Lv6/e;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lv6/e;->v:Ljava/lang/String;

    iget v2, p0, Lv6/e;->d:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v1, Lv6/e;->w:Ljava/lang/String;

    iget v2, p0, Lv6/e;->e:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public c()Lv6/e$d;
    .locals 2

    iget-object v0, p0, Lv6/e;->f:Lv6/e$d;

    if-nez v0, :cond_0

    new-instance v0, Lv6/e$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv6/e$d;-><init>(Lv6/e;Lv6/e$a;)V

    iput-object v0, p0, Lv6/e;->f:Lv6/e$d;

    :cond_0
    iget-object v0, p0, Lv6/e;->f:Lv6/e$d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lv6/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lv6/e;

    iget v2, p0, Lv6/e;->a:I

    iget v3, p1, Lv6/e;->a:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv6/e;->b:I

    iget v3, p1, Lv6/e;->b:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv6/e;->c:I

    iget v3, p1, Lv6/e;->c:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv6/e;->d:I

    iget v3, p1, Lv6/e;->d:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lv6/e;->e:I

    iget p1, p1, Lv6/e;->e:I

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

    const/16 v0, 0x20f

    iget v1, p0, Lv6/e;->a:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv6/e;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv6/e;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv6/e;->d:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lv6/e;->e:I

    add-int/2addr v0, v1

    return v0
.end method
