.class Lj3/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld4/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld4/a$d<",
        "Lj3/u<",
        "*>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj3/u$a;->b()Lj3/u;

    move-result-object v0

    return-object v0
.end method

.method public b()Lj3/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj3/u<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lj3/u;

    invoke-direct {v0}, Lj3/u;-><init>()V

    return-object v0
.end method
