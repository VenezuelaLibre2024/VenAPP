.class final Lv7/w$a;
.super Lv7/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final t:Ljava/lang/Object;


# instance fields
.field private final r:Ljava/lang/Object;

.field private final s:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv7/w$a;->t:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/s;-><init>(Lt6/d4;)V

    iput-object p2, p0, Lv7/w$a;->r:Ljava/lang/Object;

    iput-object p3, p0, Lv7/w$a;->s:Ljava/lang/Object;

    return-void
.end method

.method public static A(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)Lv7/w$a;
    .locals 1

    new-instance v0, Lv7/w$a;

    invoke-direct {v0, p0, p1, p2}, Lv7/w$a;-><init>(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method static synthetic x(Lv7/w$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lv7/w$a;->s:Ljava/lang/Object;

    return-object p0
.end method

.method public static z(Lt6/c2;)Lv7/w$a;
    .locals 3

    new-instance v0, Lv7/w$a;

    new-instance v1, Lv7/w$b;

    invoke-direct {v1, p0}, Lv7/w$b;-><init>(Lt6/c2;)V

    sget-object p0, Lt6/d4$d;->C:Ljava/lang/Object;

    sget-object v2, Lv7/w$a;->t:Ljava/lang/Object;

    invoke-direct {v0, v1, p0, v2}, Lv7/w$a;-><init>(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public g(Ljava/lang/Object;)I
    .locals 2

    iget-object v0, p0, Lv7/s;->f:Lt6/d4;

    sget-object v1, Lv7/w$a;->t:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lv7/w$a;->s:Ljava/lang/Object;

    if-eqz v1, :cond_0

    move-object p1, v1

    :cond_0
    invoke-virtual {v0, p1}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 1

    iget-object v0, p0, Lv7/s;->f:Lt6/d4;

    invoke-virtual {v0, p1, p2, p3}, Lt6/d4;->l(ILt6/d4$b;Z)Lt6/d4$b;

    iget-object p1, p2, Lt6/d4$b;->b:Ljava/lang/Object;

    iget-object v0, p0, Lv7/w$a;->s:Ljava/lang/Object;

    invoke-static {p1, v0}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Lv7/w$a;->t:Ljava/lang/Object;

    iput-object p1, p2, Lt6/d4$b;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public r(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv7/s;->f:Lt6/d4;

    invoke-virtual {v0, p1}, Lt6/d4;->r(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lv7/w$a;->s:Ljava/lang/Object;

    invoke-static {p1, v0}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lv7/w$a;->t:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 1

    iget-object v0, p0, Lv7/s;->f:Lt6/d4;

    invoke-virtual {v0, p1, p2, p3, p4}, Lt6/d4;->t(ILt6/d4$d;J)Lt6/d4$d;

    iget-object p1, p2, Lt6/d4$d;->a:Ljava/lang/Object;

    iget-object p3, p0, Lv7/w$a;->r:Ljava/lang/Object;

    invoke-static {p1, p3}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lt6/d4$d;->C:Ljava/lang/Object;

    iput-object p1, p2, Lt6/d4$d;->a:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public y(Lt6/d4;)Lv7/w$a;
    .locals 3

    new-instance v0, Lv7/w$a;

    iget-object v1, p0, Lv7/w$a;->r:Ljava/lang/Object;

    iget-object v2, p0, Lv7/w$a;->s:Ljava/lang/Object;

    invoke-direct {v0, p1, v1, v2}, Lv7/w$a;-><init>(Lt6/d4;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
