.class abstract Lg0/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static d(IILandroidx/concurrent/futures/c$a;)Lg0/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;)",
            "Lg0/a;"
        }
    .end annotation

    new-instance v0, Lg0/a;

    invoke-direct {v0, p0, p1, p2}, Lg0/a;-><init>(IILandroidx/concurrent/futures/c$a;)V

    return-object v0
.end method


# virtual methods
.method abstract a()Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method abstract b()I
.end method

.method abstract c()I
.end method
