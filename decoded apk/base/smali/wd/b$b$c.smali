.class final Lwd/b$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwd/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lbk/a<",
        "Lud/l;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field private final a:Lwd/f;


# direct methods
.method constructor <init>(Lwd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/b$b$c;->a:Lwd/f;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbk/a<",
            "Lud/l;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lwd/b$b$c;->a:Lwd/f;

    invoke-interface {v0}, Lwd/f;->c()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ltd/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwd/b$b$c;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
