.class public final Lx0/m$b$a;
.super Lx0/m$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lx0/m$b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lx0/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/n<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx0/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n<",
            "TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx0/m$b;-><init>(Lkotlin/jvm/internal/g;)V

    iput-object p1, p0, Lx0/m$b$a;->a:Lx0/n;

    return-void
.end method


# virtual methods
.method public a()Lx0/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx0/n<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lx0/m$b$a;->a:Lx0/n;

    return-object v0
.end method
