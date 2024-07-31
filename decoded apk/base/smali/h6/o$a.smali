.class public abstract Lh6/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/o;
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
.method public abstract a()Lh6/o;
.end method

.method abstract b(Lf6/b;)Lh6/o$a;
.end method

.method abstract c(Lf6/c;)Lh6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/c<",
            "*>;)",
            "Lh6/o$a;"
        }
    .end annotation
.end method

.method abstract d(Lf6/e;)Lh6/o$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/e<",
            "*[B>;)",
            "Lh6/o$a;"
        }
    .end annotation
.end method

.method public abstract e(Lh6/p;)Lh6/o$a;
.end method

.method public abstract f(Ljava/lang/String;)Lh6/o$a;
.end method
