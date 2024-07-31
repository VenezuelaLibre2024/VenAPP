.class public Lo3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/p<",
        "Ln3/h;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ln3/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/n<",
            "Ln3/h;",
            "Ln3/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln3/n;

    const-wide/16 v1, 0x1f4

    invoke-direct {v0, v1, v2}, Ln3/n;-><init>(J)V

    iput-object v0, p0, Lo3/a$a;->a:Ln3/n;

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
            "Ln3/h;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Lo3/a;

    iget-object v0, p0, Lo3/a$a;->a:Ln3/n;

    invoke-direct {p1, v0}, Lo3/a;-><init>(Ln3/n;)V

    return-object p1
.end method
