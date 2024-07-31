.class public final synthetic Ldf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/e;


# instance fields
.field public final synthetic a:Ldf/g;


# direct methods
.method public synthetic constructor <init>(Ldf/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/f;->a:Ldf/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldf/f;->a:Ldf/g;

    check-cast p1, Ldf/z;

    invoke-static {v0, p1}, Ldf/g;->b(Ldf/g;Ldf/z;)[B

    move-result-object p1

    return-object p1
.end method
