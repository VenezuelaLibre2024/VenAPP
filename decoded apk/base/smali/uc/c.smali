.class public Luc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Luc/a;)V
    .locals 1

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p1

    const-string v0, "Could not register handler for breadcrumbs events."

    invoke-virtual {p1, v0}, Lsc/g;->b(Ljava/lang/String;)V

    return-void
.end method
