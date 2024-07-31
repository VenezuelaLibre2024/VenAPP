.class public Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;
    }
.end annotation


# static fields
.field private static final forceResendingTokens:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/google/firebase/auth/q0$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final activityRef:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field autoRetrievedSmsCodeForTesting:Ljava/lang/String;

.field private eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

.field final firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

.field forceResendingToken:Ljava/lang/Integer;

.field final multiFactorInfo:Lcom/google/firebase/auth/t0;

.field final multiFactorSession:Lcom/google/firebase/auth/l0;

.field final onCredentialsListener:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;

.field final phoneNumber:Ljava/lang/String;

.field final timeout:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingTokens:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;Lcom/google/firebase/auth/l0;Lcom/google/firebase/auth/t0;Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->activityRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object p4, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorSession:Lcom/google/firebase/auth/l0;

    iput-object p5, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorInfo:Lcom/google/firebase/auth/t0;

    invoke-static {p2}, Lio/flutter/plugins/firebase/auth/FlutterFirebaseAuthPlugin;->getAuthFromPigeon(Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->phoneNumber:Ljava/lang/String;

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getTimeout()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toIntExact(J)I

    move-result p1

    iput p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->timeout:I

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getAutoRetrievedSmsCodeForTesting()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getAutoRetrievedSmsCodeForTesting()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->autoRetrievedSmsCodeForTesting:Ljava/lang/String;

    :cond_0
    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getForceResendingToken()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p3}, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;->getForceResendingToken()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toIntExact(J)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingToken:Ljava/lang/Integer;

    :cond_1
    iput-object p6, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->onCredentialsListener:Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$OnCredentialsListener;

    return-void
.end method

.method static synthetic access$000(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)Lio/flutter/plugin/common/EventChannel$EventSink;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-object p0
.end method

.method static synthetic access$100()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingTokens:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->activityRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 2

    iput-object p2, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->eventSink:Lio/flutter/plugin/common/EventChannel$EventSink;

    new-instance p1, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;

    invoke-direct {p1, p0}, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler$1;-><init>(Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;)V

    iget-object p2, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->autoRetrievedSmsCodeForTesting:Ljava/lang/String;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-virtual {p2}, Lcom/google/firebase/auth/FirebaseAuth;->l()Lcom/google/firebase/auth/w;

    move-result-object p2

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->phoneNumber:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->autoRetrievedSmsCodeForTesting:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Lcom/google/firebase/auth/w;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance p2, Lcom/google/firebase/auth/p0$a;

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->firebaseAuth:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p2, v0}, Lcom/google/firebase/auth/p0$a;-><init>(Lcom/google/firebase/auth/FirebaseAuth;)V

    iget-object v0, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->activityRef:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p2, v0}, Lcom/google/firebase/auth/p0$a;->b(Landroid/app/Activity;)Lcom/google/firebase/auth/p0$a;

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/p0$a;->c(Lcom/google/firebase/auth/q0$b;)Lcom/google/firebase/auth/p0$a;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->phoneNumber:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/p0$a;->g(Ljava/lang/String;)Lcom/google/firebase/auth/p0$a;

    :cond_1
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorSession:Lcom/google/firebase/auth/l0;

    if-eqz p1, :cond_2

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/p0$a;->f(Lcom/google/firebase/auth/l0;)Lcom/google/firebase/auth/p0$a;

    :cond_2
    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->multiFactorInfo:Lcom/google/firebase/auth/t0;

    if-eqz p1, :cond_3

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/p0$a;->e(Lcom/google/firebase/auth/t0;)Lcom/google/firebase/auth/p0$a;

    :cond_3
    iget p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->timeout:I

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2, p1, v0}, Lcom/google/firebase/auth/p0$a;->h(Ljava/lang/Long;Ljava/util/concurrent/TimeUnit;)Lcom/google/firebase/auth/p0$a;

    iget-object p1, p0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingToken:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    sget-object v0, Lio/flutter/plugins/firebase/auth/PhoneNumberVerificationStreamHandler;->forceResendingTokens:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/q0$a;

    if-eqz p1, :cond_4

    invoke-virtual {p2, p1}, Lcom/google/firebase/auth/p0$a;->d(Lcom/google/firebase/auth/q0$a;)Lcom/google/firebase/auth/p0$a;

    :cond_4
    invoke-virtual {p2}, Lcom/google/firebase/auth/p0$a;->a()Lcom/google/firebase/auth/p0;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/auth/q0;->b(Lcom/google/firebase/auth/p0;)V

    return-void
.end method
