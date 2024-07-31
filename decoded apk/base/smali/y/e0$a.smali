.class abstract Ly/e0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static d(II)Ly/e0$a;
    .locals 2

    new-instance v0, Ly/f;

    new-instance v1, Lg0/v;

    invoke-direct {v1}, Lg0/v;-><init>()V

    invoke-direct {v0, v1, p0, p1}, Ly/f;-><init>(Lg0/v;II)V

    return-object v0
.end method


# virtual methods
.method abstract a()Lg0/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg0/v<",
            "Ly/e0$b;",
            ">;"
        }
    .end annotation
.end method

.method abstract b()I
.end method

.method abstract c()I
.end method
