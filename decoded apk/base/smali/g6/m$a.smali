.class public abstract Lg6/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lg6/m;
.end method

.method public abstract b(Lg6/k;)Lg6/m$a;
.end method

.method public abstract c(Ljava/util/List;)Lg6/m$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg6/l;",
            ">;)",
            "Lg6/m$a;"
        }
    .end annotation
.end method

.method abstract d(Ljava/lang/Integer;)Lg6/m$a;
.end method

.method abstract e(Ljava/lang/String;)Lg6/m$a;
.end method

.method public abstract f(Lg6/p;)Lg6/m$a;
.end method

.method public abstract g(J)Lg6/m$a;
.end method

.method public abstract h(J)Lg6/m$a;
.end method

.method public i(I)Lg6/m$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg6/m$a;->d(Ljava/lang/Integer;)Lg6/m$a;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lg6/m$a;
    .locals 0

    invoke-virtual {p0, p1}, Lg6/m$a;->e(Ljava/lang/String;)Lg6/m$a;

    move-result-object p1

    return-object p1
.end method
