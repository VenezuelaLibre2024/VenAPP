.class public final synthetic Lrl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/r$c;


# instance fields
.field public final synthetic a:Lql/r;


# direct methods
.method public synthetic constructor <init>(Lql/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl/c;->a:Lql/r;

    return-void
.end method


# virtual methods
.method public final a(Lql/e;)Lql/r;
    .locals 1

    iget-object v0, p0, Lrl/c;->a:Lql/r;

    invoke-static {v0, p1}, Lrl/d;->b(Lql/r;Lql/e;)Lql/r;

    move-result-object p1

    return-object p1
.end method
