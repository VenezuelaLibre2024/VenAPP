.class public final Ln3/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln3/p<",
        "TModel;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ln3/e$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/e$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln3/e$c$a;

    invoke-direct {v0, p0}, Ln3/e$c$a;-><init>(Ln3/e$c;)V

    iput-object v0, p0, Ln3/e$c;->a:Ln3/e$a;

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
            "TModel;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance p1, Ln3/e;

    iget-object v0, p0, Ln3/e$c;->a:Ln3/e$a;

    invoke-direct {p1, v0}, Ln3/e;-><init>(Ln3/e$a;)V

    return-object p1
.end method
