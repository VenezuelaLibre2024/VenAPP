.class public final synthetic Lg7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/g;


# instance fields
.field public final synthetic a:Lg7/g;


# direct methods
.method public synthetic constructor <init>(Lg7/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/e;->a:Lg7/g;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lg7/e;->a:Lg7/g;

    check-cast p1, Lg7/o;

    invoke-virtual {v0, p1}, Lg7/g;->n(Lg7/o;)Lg7/o;

    move-result-object p1

    return-object p1
.end method
