.class public Ln3/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/p<",
        "[B",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ln3/s;)Ln3/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/s;",
            ")",
            "Ln3/o<",
            "[B",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Ln3/b;

    new-instance v0, Ln3/b$d$a;

    invoke-direct {v0, p0}, Ln3/b$d$a;-><init>(Ln3/b$d;)V

    invoke-direct {p1, v0}, Ln3/b;-><init>(Ln3/b$b;)V

    return-object p1
.end method
