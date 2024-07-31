.class public final synthetic Lec/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# instance fields
.field public final synthetic a:Lpc/e0;

.field public final synthetic b:Lpc/e0;

.field public final synthetic c:Lpc/e0;

.field public final synthetic d:Lpc/e0;


# direct methods
.method public synthetic constructor <init>(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec/f;->a:Lpc/e0;

    iput-object p2, p0, Lec/f;->b:Lpc/e0;

    iput-object p3, p0, Lec/f;->c:Lpc/e0;

    iput-object p4, p0, Lec/f;->d:Lpc/e0;

    return-void
.end method


# virtual methods
.method public final a(Lpc/d;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lec/f;->a:Lpc/e0;

    iget-object v1, p0, Lec/f;->b:Lpc/e0;

    iget-object v2, p0, Lec/f;->c:Lpc/e0;

    iget-object v3, p0, Lec/f;->d:Lpc/e0;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->a(Lpc/e0;Lpc/e0;Lpc/e0;Lpc/e0;Lpc/d;)Lec/e;

    move-result-object p1

    return-object p1
.end method
