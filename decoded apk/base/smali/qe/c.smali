.class public final Lqe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbk/a;"
    }
.end annotation


# instance fields
.field private final a:Lqe/a;


# direct methods
.method public constructor <init>(Lqe/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe/c;->a:Lqe/a;

    return-void
.end method

.method public static a(Lqe/a;)Lqe/c;
    .locals 1

    new-instance v0, Lqe/c;

    invoke-direct {v0, p0}, Lqe/c;-><init>(Lqe/a;)V

    return-object v0
.end method

.method public static c(Lqe/a;)Lzb/g;
    .locals 1

    invoke-virtual {p0}, Lqe/a;->b()Lzb/g;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lhi/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzb/g;

    return-object p0
.end method


# virtual methods
.method public b()Lzb/g;
    .locals 1

    iget-object v0, p0, Lqe/c;->a:Lqe/a;

    invoke-static {v0}, Lqe/c;->c(Lqe/a;)Lzb/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqe/c;->b()Lzb/g;

    move-result-object v0

    return-object v0
.end method
