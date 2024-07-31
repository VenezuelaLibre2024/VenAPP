.class public abstract Lvi/q0;
.super Lvi/p0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/q0$a;
    }
.end annotation


# static fields
.field private static final a:Lvi/y0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lvi/q0$a;

    invoke-direct {v0}, Lvi/q0$a;-><init>()V

    invoke-static {v0}, Lvi/y0$c;->a(Ljava/lang/Object;)Lvi/y0$c;

    move-result-object v0

    sput-object v0, Lvi/q0;->a:Lvi/y0$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/p0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()I
.end method

.method public abstract d()Z
.end method

.method public e(Ljava/util/Map;)Lvi/y0$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Lvi/y0$c;"
        }
    .end annotation

    sget-object p1, Lvi/q0;->a:Lvi/y0$c;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "policy"

    invoke-virtual {p0}, Lvi/q0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "priority"

    invoke-virtual {p0}, Lvi/q0;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->b(Ljava/lang/String;I)Leb/i$b;

    move-result-object v0

    const-string v1, "available"

    invoke-virtual {p0}, Lvi/q0;->d()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->e(Ljava/lang/String;Z)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
