.class public final synthetic Lfc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# instance fields
.field public final synthetic a:Lpc/e0;

.field public final synthetic b:Lpc/e0;

.field public final synthetic c:Lpc/e0;


# direct methods
.method public synthetic constructor <init>(Lpc/e0;Lpc/e0;Lpc/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfc/b;->a:Lpc/e0;

    iput-object p2, p0, Lfc/b;->b:Lpc/e0;

    iput-object p3, p0, Lfc/b;->c:Lpc/e0;

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lfc/b;->a:Lpc/e0;

    iget-object v1, p0, Lfc/b;->b:Lpc/e0;

    iget-object v2, p0, Lfc/b;->c:Lpc/e0;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;->a(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lgc/e;

    move-result-object p1

    return-object p1
.end method
