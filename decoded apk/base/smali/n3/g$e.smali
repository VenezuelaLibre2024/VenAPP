.class public Ln3/g$e;
.super Ln3/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ln3/g$a<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Ln3/g$e$a;

    invoke-direct {v0}, Ln3/g$e$a;-><init>()V

    invoke-direct {p0, v0}, Ln3/g$a;-><init>(Ln3/g$d;)V

    return-void
.end method
