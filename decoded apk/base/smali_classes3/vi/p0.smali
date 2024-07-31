.class public abstract Lvi/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/p0$c;,
        Lvi/p0$j;,
        Lvi/p0$h;,
        Lvi/p0$d;,
        Lvi/p0$b;,
        Lvi/p0$e;,
        Lvi/p0$f;,
        Lvi/p0$i;,
        Lvi/p0$g;
    }
.end annotation


# static fields
.field public static final b:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "internal:health-checking-config"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lvi/p0;->b:Lvi/a$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$g;)Z
    .locals 4

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvi/p0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lvi/g1;->u:Lvi/g1;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NameResolver returned no usable address. addrs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", attrs="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/p0$g;->b()Lvi/a;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvi/p0;->c(Lvi/g1;)V

    return v1

    :cond_0
    iget v0, p0, Lvi/p0;->a:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lvi/p0;->a:I

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lvi/p0;->d(Lvi/p0$g;)V

    :cond_1
    iput v1, p0, Lvi/p0;->a:I

    const/4 p1, 0x1

    return p1
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract c(Lvi/g1;)V
.end method

.method public d(Lvi/p0$g;)V
    .locals 2

    iget v0, p0, Lvi/p0;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lvi/p0;->a:I

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lvi/p0;->a(Lvi/p0$g;)Z

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lvi/p0;->a:I

    return-void
.end method

.method public abstract e()V
.end method
