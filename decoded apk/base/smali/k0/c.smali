.class public Lk0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lk0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk0/f<",
            "Lk0/b;",
            ">;"
        }
    .end annotation
.end field

.field b:Lk0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk0/f<",
            "Lk0/b;",
            ">;"
        }
    .end annotation
.end field

.field c:Lk0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk0/f<",
            "Lk0/i;",
            ">;"
        }
    .end annotation
.end field

.field d:[Lk0/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk0/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lk0/g;-><init>(I)V

    iput-object v0, p0, Lk0/c;->a:Lk0/f;

    new-instance v0, Lk0/g;

    invoke-direct {v0, v1}, Lk0/g;-><init>(I)V

    iput-object v0, p0, Lk0/c;->b:Lk0/f;

    new-instance v0, Lk0/g;

    invoke-direct {v0, v1}, Lk0/g;-><init>(I)V

    iput-object v0, p0, Lk0/c;->c:Lk0/f;

    const/16 v0, 0x20

    new-array v0, v0, [Lk0/i;

    iput-object v0, p0, Lk0/c;->d:[Lk0/i;

    return-void
.end method
