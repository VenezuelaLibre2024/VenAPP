.class public final synthetic Lnm/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnm/m;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lnm/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm/h;->a:Lnm/m;

    iput-object p2, p0, Lnm/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lnm/h;->c:Ljava/lang/String;

    iput-object p4, p0, Lnm/h;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lnm/h;->a:Lnm/m;

    iget-object v1, p0, Lnm/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lnm/h;->c:Ljava/lang/String;

    iget-object v3, p0, Lnm/h;->d:Ljava/lang/Object;

    invoke-static {v0, v1, v2, v3}, Lnm/m;->f(Lnm/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
