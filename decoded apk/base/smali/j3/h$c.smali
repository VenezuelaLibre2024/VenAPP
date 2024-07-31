.class final Lj3/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj3/i$a<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field private final a:Lh3/a;

.field final synthetic b:Lj3/h;


# direct methods
.method constructor <init>(Lj3/h;Lh3/a;)V
    .locals 0

    iput-object p1, p0, Lj3/h$c;->b:Lj3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj3/h$c;->a:Lh3/a;

    return-void
.end method


# virtual methods
.method public a(Lj3/v;)Lj3/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "TZ;>;)",
            "Lj3/v<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lj3/h$c;->b:Lj3/h;

    iget-object v1, p0, Lj3/h$c;->a:Lh3/a;

    invoke-virtual {v0, v1, p1}, Lj3/h;->D(Lh3/a;Lj3/v;)Lj3/v;

    move-result-object p1

    return-object p1
.end method
