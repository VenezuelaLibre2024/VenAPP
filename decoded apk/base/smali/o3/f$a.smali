.class public Lo3/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/p<",
        "Ljava/net/URL;",
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
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/s;",
            ")",
            "Ln3/o<",
            "Ljava/net/URL;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo3/f;

    const-class v1, Ln3/h;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ln3/s;->d(Ljava/lang/Class;Ljava/lang/Class;)Ln3/o;

    move-result-object p1

    invoke-direct {v0, p1}, Lo3/f;-><init>(Ln3/o;)V

    return-object v0
.end method
