.class final synthetic Lcom/google/firebase/iid/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpc/g;


# static fields
.field static final a:Lpc/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/iid/o;

    invoke-direct {v0}, Lcom/google/firebase/iid/o;-><init>()V

    sput-object v0, Lcom/google/firebase/iid/o;->a:Lpc/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lpc/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/iid/Registrar;->lambda$getComponents$0$Registrar(Lpc/d;)Lcom/google/firebase/iid/FirebaseInstanceId;

    move-result-object p1

    return-object p1
.end method
