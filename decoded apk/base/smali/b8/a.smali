.class public final Lb8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb8/h;Lb8/g;)Ls8/g0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/h;",
            "Lb8/g;",
            ")",
            "Ls8/g0$a<",
            "Lb8/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lb8/j;

    invoke-direct {v0, p1, p2}, Lb8/j;-><init>(Lb8/h;Lb8/g;)V

    return-object v0
.end method

.method public b()Ls8/g0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls8/g0$a<",
            "Lb8/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lb8/j;

    invoke-direct {v0}, Lb8/j;-><init>()V

    return-object v0
.end method
